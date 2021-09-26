import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
    }

    public void setNumerator(int num) {
        numerator = num;
    }

    public void setDenominator(int num) {
        denominator = num;
    }

    public double returnValue() {
        return (double) numerator / denominator;
    }

    public String reduced() {
        int smallerNum;
        int largerNum;
        int redNumerator = numerator;
        int redDenominator = denominator;

        if (numerator <= denominator) {
            smallerNum = numerator;
            largerNum = denominator;
        } else {
            smallerNum = denominator;
            largerNum = numerator;
        }

        for (int i = smallerNum; i > 0; i--) {
            if (largerNum % i == 0 && smallerNum % i == 0) {
                redNumerator /= i;
                redDenominator /= i;
                break;
            }
        }

        return "This fraction equates to " + redNumerator + "/" + redDenominator;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Fraction fraction = new Fraction();
        System.out.print("What is your numerator? ");
        fraction.setNumerator(keyboard.nextInt());
        System.out.print("What is your denominator? ");
        fraction.setDenominator(keyboard.nextInt());
        System.out.println("---------------------------------------------");
        System.out.printf("%nYour fraction is %d/%d", fraction.numerator, fraction.denominator);
        System.out.printf("%nIt evaluates to %.2f", fraction.returnValue());
        System.out.printf("%n%s%n%n", fraction.reduced());
        System.out.println("---------------------------------------------");
        keyboard.close();
    }
}

// TEST CASE OUTPUT
// What is your numerator? 1
// What is your denominator? 3
// ---------------------------------------------

// Your fraction is 1/3
// It evaluates to 0.33
// This fraction equates to 1/3

// ---------------------------------------------
// What is your numerator? 20
// What is your denominator? 60
// ---------------------------------------------

// Your fraction is 20/60
// It evaluates to 0.33
// This fraction equates to 1/3

// ---------------------------------------------
// What is your numerator? 35
// What is your denominator? 7
// ---------------------------------------------

// Your fraction is 35/7
// It evaluates to 5.00
// This fraction equates to 5/1

// ---------------------------------------------
// What is your numerator? 77
// What is your denominator? 9
// ---------------------------------------------

// Your fraction is 77/9
// It evaluates to 8.56
// This fraction equates to 77/9

// ---------------------------------------------