package bill;

import java.util.Scanner;

public class Bill {

    public static void main(String[] args) {
        String item1, item2, item3;
        int quant1, quant2, quant3;
        double price1, price2, price3, item1Total, item2Total, item3Total, itemSubtotal, salesTax;
        Scanner scannerObject = new Scanner(System.in);

        scannerObject.useDelimiter("\n");
        System.out.print("Input name of item 1: ");
        item1 = scannerObject.next();
        System.out.print("Input quantity of item 1: ");
        quant1 = scannerObject.nextInt();
        System.out.print("Input price of item 1: ");
        price1 = scannerObject.nextDouble();
        item1Total = quant1 * price1;

        System.out.print("Input name of item 2: ");
        item2 = scannerObject.next();
        System.out.print("Input quantity of item 2: ");
        quant2 = scannerObject.nextInt();
        System.out.print("Input price of item 2: ");
        price2 = scannerObject.nextDouble();
        item2Total = quant2 * price2;

        System.out.print("Input name of item 3: ");
        item3 = scannerObject.next();
        System.out.print("Input quantity of item 3: ");
        quant3 = scannerObject.nextInt();
        System.out.print("Input price of item 3: ");
        price3 = scannerObject.nextDouble();
        item3Total = quant3 * price3;

        itemSubtotal = item1Total + item2Total + item3Total;
        salesTax = 0.0625 * itemSubtotal;

        System.out.println("\nYour bill:");
        System.out.printf("\n%-30s%10s%10s%10s", "Item", "Quantity", "Price", "Total");
        System.out.printf("\n%-30s%10d%10.2f%10.2f", item1, quant1, price1, item1Total);
        System.out.printf("\n%-30s%10d%10.2f%10.2f", item2, quant2, price2, item2Total);
        System.out.printf("\n%-30s%10d%10.2f%10.2f", item3, quant3, price3, item3Total);
        System.out.println("\n");

        System.out.printf("\n%-20s$%-10.2f", "Subtotal", itemSubtotal);
        System.out.printf("\n%-20s$%-10.2f", "6.25% sales tax", salesTax);
        System.out.printf("\n%-20s$%-10.2f", "Total", itemSubtotal + salesTax);
        System.out.println("\n");
    }
}
