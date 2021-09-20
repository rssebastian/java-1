package bill;

import java.util.Scanner;

public class Bill {

    public static void main(String[] args) {
        String item1, item2, item3;
        int quant1, quant2, quant3;
        double price1, price2, price3, item1Total, item2Total, item3Total, itemSubtotal, salesTax;
        Scanner scannerObject = new Scanner(System.in);

        System.out.print("Input name of item 1: ");
        item1 = scannerObject.nextLine();
        System.out.print("Input quantity of item 1: ");
        quant1 = scannerObject.nextInt();
        System.out.print("Input price of item 1: ");
        price1 = scannerObject.nextDouble();
        scannerObject.nextLine();
        item1Total = quant1 * price1;

        System.out.print("Input name of item 2: ");
        item2 = scannerObject.nextLine();
        System.out.print("Input quantity of item 2: ");
        quant2 = scannerObject.nextInt();
        System.out.print("Input price of item 2: ");
        price2 = scannerObject.nextDouble();
        scannerObject.nextLine();
        item2Total = quant2 * price2;

        System.out.print("Input name of item 3: ");
        item3 = scannerObject.nextLine();
        System.out.print("Input quantity of item 3: ");
        quant3 = scannerObject.nextInt();
        System.out.print("Input price of item 3: ");
        price3 = scannerObject.nextDouble();
        item3Total = quant3 * price3;

        itemSubtotal = item1Total + item2Total + item3Total;
        salesTax = 0.0625 * itemSubtotal;

        System.out.printf("%n");
        System.out.println("Your bill:");
        System.out.printf("%-30s%10s%10s%10s%n", "Item", "Quantity", "Price", "Total");
        System.out.printf("%-30s%10d%10.2f%10.2f%n", item1, quant1, price1, item1Total);
        System.out.printf("%-30s%10d%10.2f%10.2f%n", item2, quant2, price2, item2Total);
        System.out.printf("%-30s%10d%10.2f%10.2f%n", item3, quant3, price3, item3Total);

        System.out.printf("%n");
        System.out.printf("%-20s$%-10.2f%n", "Subtotal", itemSubtotal);
        System.out.printf("%-20s$%-10.2f%n", "6.25% sales tax", salesTax);
        System.out.printf("%-20s$%-10.2f%n", "Total", itemSubtotal + salesTax);

        scannerObject.close();
    }
}
// TEST CASE OUTPUT
// Input name of item 1: lollipops
// Input quantity of item 1: 10
// Input price of item 1: 0.50
// Input name of item 2: diet soda
// Input quantity of item 2: 3
// Input price of item 2: 1.25
// Input name of item 3: chocolate bar
// Input quantity of item 3: 20
// Input price of item 3: 0.75
//
// Your bill:
// Item Quantity Price Total
// lollipops 10 0.50 5.00
// diet soda 3 1.25 3.75
// chocolate bar 20 0.75 15.00

// Subtotal $23.75
// 6.25% sales tax $1.48
// Total $25.23
// ----------------------------------
// Input name of item 1: milk
// Input quantity of item 1: 1
// Input price of item 1: 4.99
// Input name of item 2: eggs
// Input quantity of item 2: 2
// Input price of item 2: 6.99
// Input name of item 3: chips
// Input quantity of item 3: 5
// Input price of item 3: 2.99
//
// Your bill:
// Item Quantity Price Total
// milk 1 4.99 4.99
// eggs 2 6.99 13.98
// chips 5 2.99 14.95

// Subtotal $33.92
// 6.25% sales tax $2.12
// Total $36.04