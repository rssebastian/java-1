import java.util.Scanner;

public class ThermostatTester {
    public static void main(String[] args) throws TemperatureOutofRange {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Create your new thermostat! Set the lowest possible temperature: ");
        int low = keyboard.nextInt();
        System.out.print("\r\nSet the highest possible temperature: ");
        int high = keyboard.nextInt();
        Thermostat t = new Thermostat(low, high);
        System.out.printf("%nYour new thermostat has a low of %d and a high of %d.%n", low, high);
        System.out.print("Please set a temperature: ");
        int temp = keyboard.nextInt();
        try {
            t.setTemperature(temp);
        } catch (TemperatureOutofRange e) {
            System.out.println(e.getMessage());
            secondChance(low, high);
        }
    }

    public static void secondChance(int low, int high) throws TemperatureTooLow, TemperatureTooHigh {
        Scanner keyboard = new Scanner(System.in);
        boolean validTemp = false;
        while (!validTemp) {
            try {
                System.out.println("Please input a new temperature: ");
                int temp = keyboard.nextInt();
                if (temp < low) {
                    throw new TemperatureTooLow();
                } else if (temp > high) {
                    throw new TemperatureTooHigh();
                } else {
                    validTemp = true;
                }
            } catch (TemperatureTooLow e) {
                System.out.println(e.getMessage());
            } catch (TemperatureTooHigh e) {
                System.out.println(e.getMessage());
            }
        }
        keyboard.close();

    }
}