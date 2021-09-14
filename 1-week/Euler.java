import java.util.Scanner;

public class Euler {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean done = false;
        
        // Keep running until user is done
        while (!done) {
            System.out.print("To what value of e^x would you like to calculate? ");
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
                for (int n=1; n<=100; n++) {
                    if (n==1) {
                        eValue += 1;
                    } else {
                        numerator *= initialXValue;
                        nthTerm = numerator / n;
                        
                        //Divide by 1 through n instead of calculating the factorial
                        for (int i=n-1; i>0; i--) {
                            nthTerm /= i;
                        }
                        eValue += nthTerm;
                    }
                    if (n==10){
                        System.out.printf("When n == 10, e^%d == %f%n", initialXValue, eValue);
                    } else if (n==50) {
                        System.out.printf("When n == 50, e^%d == %f%n", initialXValue, eValue); 
                    } else if (n==100) {
                        System.out.printf("When n == 100, e^%d == %f%n", initialXValue, eValue);
                    }
                }
                System.out.print("Would you like to run another calculation? (Y/N): ");
                if (!keyboard.next().equalsIgnoreCase("Y")) done = true;
                } 
        }
        keyboard.close();
    }
}
