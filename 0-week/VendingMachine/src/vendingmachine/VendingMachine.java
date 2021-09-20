package vendingmachine;

import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {
        int itemCost = 0;
        int change = 0;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;

        Scanner scannerObject = new Scanner(System.in);

        System.out.print("Enter price of item (from 25 cents to a dollar, in 5-cent increments): ");

        itemCost = scannerObject.nextInt();
        change = 100 - itemCost;
        while (change > 0) {
            if (change - 25 >= 0) {
                quarters++;
                change -= 25;
            } else if (change - 10 >= 0) {
                dimes++;
                change -= 10;
            } else if (change - 5 >= 0) {
                nickels++;
                change -= 5;
            }
        }

        System.out.println("You bought an item for " + itemCost + " cents and gave me a dollar, so your change is:");
        System.out.println(quarters + " quarter(s)");
        System.out.println(dimes + " dime(s)");
        System.out.println(nickels + " nickel(s)");
    }
}
// TEST CASE OUTPUT
// -------------------------
// Enter price of item (from 25 cents to a dollar, in 5-cent increments): 45
// You bought an item for 45 cents and gave me a dollar, so your change is:
// 2 quarter(s)
// 0 dime(s)
// 1 nickel(s)
// -------------------------
// Enter price of item (from 25 cents to a dollar, in 5-cent increments): 65
// You bought an item for 65 cents and gave me a dollar, so your change is:
// 1 quarter(s)
// 1 dime(s)
// 0 nickel(s)
