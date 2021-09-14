package vendingmachine;
import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {
        int itemCost, quarters, dimes, nickels;
        quarters = dimes = nickels = 0;
        Scanner scannerObject = new Scanner(System.in);
        
        System.out.print("Enter price of item (from 25 cents to a dollar, in 5-cent increments): ");
    
        itemCost = (int) scannerObject.nextInt();
        while (itemCost > 0) {
            if (itemCost - 25 >= 0) {
                quarters++;
                itemCost -= 25;
            }
            else if (itemCost - 10 >= 0) {
                dimes++;
                itemCost -= 10;
            }
            else if (itemCost - 5 >= 0) {
                nickels++;
                itemCost -= 5;
            }
        }
        
        System.out.println("You bought an item for " + itemCost + " cents and gave me a dollar, so your change is:");
        System.out.println(quarters + " quarter(s)");
        System.out.println(dimes + " dime(s)");
        System.out.println(nickels + " nickel(s)");
    }
}
