import java.util.Scanner;

public class Euler {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean done = false;

        // Keep running until user is done
        while (!done) {
            System.out.print("To what value x of e^x would you like to calculate? ");
            int initialXValue = keyboard.nextInt();

            if (initialXValue == 0) {
                System.out.println("When n == 10, e^0 == 1");
                System.out.println("When n == 50, e^0 == 1");
                System.out.println("When n == 100, e^0 == 1");
            } else {
                double eValue = 1;
                double numerator = initialXValue;
                double nthTerm;

                // Calculate the nth term
                for (int n = 1; n <= 100; n++) {
                    if (n == 1) {
                        eValue += 1;
                    } else {
                        numerator *= initialXValue;
                        nthTerm = numerator / n;

                        // Divide by 1 through n instead of calculating the factorial
                        for (int i = n - 1; i > 0; i--) {
                            nthTerm /= i;
                        }
                        eValue += nthTerm;
                    }
                    if (n == 10) {
                        System.out.printf("When n == 10, e^%d == %f%n", initialXValue, eValue);
                    } else if (n == 50) {
                        System.out.printf("When n == 50, e^%d == %f%n", initialXValue, eValue);
                    } else if (n == 100) {
                        System.out.printf("When n == 100, e^%d == %f%n", initialXValue, eValue);
                    }
                }
                System.out.print("Would you like to run another calculation? (Y/N): ");
                if (!keyboard.next().equalsIgnoreCase("Y"))
                    done = true;
            }
        }
        keyboard.close();
    }
}

// TEST CASE OUTPUT
// To what value x of e^x would you like to calculate? 1
// When n == 10, e^1 == 2.718282
// When n == 50, e^1 == 2.718282
// When n == 100, e^1 == 2.718282
// Would you like to run another calculation? (Y/N): y
// To what value x of e^x would you like to calculate? 2
// When n == 10, e^2 == 6.388995
// When n == 50, e^2 == 6.389056
// When n == 100, e^2 == 6.389056
// Would you like to run another calculation? (Y/N): y
// To what value x of e^x would you like to calculate? 3
// When n == 10, e^3 == 18.079665
// When n == 50, e^3 == 18.085537
// When n == 100, e^3 == 18.085537
// Would you like to run another calculation? (Y/N): n