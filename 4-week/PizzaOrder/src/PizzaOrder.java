import java.util.Scanner;

public class PizzaOrder {
    private int numPizzas;
    private Pizza pizza1 = null;
    private Pizza pizza2 = null;
    private Pizza pizza3 = null;

    public PizzaOrder(Pizza pizza1) {
    }

    public PizzaOrder(Pizza pizza1, Pizza pizza2) {
    }

    public PizzaOrder(Pizza pizza1, Pizza pizza2, Pizza pizza3) {
    }

    // A copy constructor that takes another PizzaOrder object and makes an
    // independent copy of its pizzas
    public PizzaOrder(PizzaOrder order) {
        if (order.getPizza1() != null) {
            this.numPizzas = order.getNumPizzas();
            this.pizza1 = new Pizza();
            this.pizza1.setSize(order.getPizza1().getSize());
            this.pizza1.setNumCheese(order.getPizza1().getNumCheese());
            this.pizza1.setNumPepperoni(order.getPizza1().getNumPepperoni());
            this.pizza1.setNumHam(order.getPizza1().getNumHam());
        }

        if (order.getPizza2() != null) {
            this.pizza2 = new Pizza();
            this.pizza1.setSize(order.getPizza2().getSize());
            this.pizza2.setNumCheese(order.getPizza2().getNumCheese());
            this.pizza2.setNumPepperoni(order.getPizza2().getNumPepperoni());
            this.pizza2.setNumHam(order.getPizza2().getNumHam());
        }

        if (order.getPizza3() != null) {
            this.pizza3 = new Pizza();
            this.pizza1.setSize(order.getPizza3().getSize());
            this.pizza3.setNumCheese(order.getPizza3().getNumCheese());
            this.pizza3.setNumPepperoni(order.getPizza3().getNumPepperoni());
            this.pizza3.setNumHam(order.getPizza3().getNumHam());
        }
    }

    // sets the number of pizzas in the order. numPizzas must be between 1 and 3
    public void setNumPizzas(int numPizzas) {
        if (numPizzas < 1 || numPizzas > 3) {
            System.out.println("Please order 1-3 pizzas.");
            System.exit(0);
        } else {
            this.numPizzas = numPizzas;
        }
    }

    // sets the first pizza in the order
    public void setPizza1(Pizza pizza) {
        this.pizza1 = pizza;
    }

    // sets the second pizza in the order
    public void setPizza2(Pizza pizza) {
        this.pizza2 = pizza;
    }

    // sets the third pizza in the order
    public void setPizza3(Pizza pizza) {
        this.pizza3 = pizza;
    }

    // returns the total cost of the order
    public double calcTotal() {
        if (this.pizza3 == null) {
            if (this.pizza2 == null) {
                return this.pizza1.calcCost();
            } else {
                return this.pizza1.calcCost() + this.pizza2.calcCost();
            }
        } else {
            return this.pizza1.calcCost() + this.pizza2.calcCost() + this.pizza3.calcCost();
        }

    }

    // returns the number of pizzas in the order
    public int getNumPizzas() {
        return this.numPizzas;
    }

    // returns the first pizza in the order or null if pizza1 is not set
    public Pizza getPizza1() {
        return this.pizza1;
    }

    // returns the second pizza in the order or null if pizza2 is not set
    public Pizza getPizza2() {
        return this.pizza2;
    }

    // returns the third pizza in the order or null if pizza3 is not set
    public Pizza getPizza3() {
        return this.pizza3;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String linebreak = "---------------------------------";
        System.out.println(linebreak);
        System.out.println("Let me get started on your first order: ");

        // Code to create a large pizza, 1 cheese, 1 ham
        Pizza pizza1 = new Pizza();
        pizza1.setSize("large");
        pizza1.setNumCheese(1);
        pizza1.setNumHam(1);
        System.out.printf("First Pizza: %s size, %d cheese, %d pepperoni, %d ham%n", pizza1.getSize(),
                pizza1.getNumCheese(), pizza1.getNumPepperoni(), pizza1.getNumHam());

        // Code to create a medium pizza, 2 cheese, 2 pepperoni
        Pizza pizza2 = new Pizza();
        pizza2.setSize("medium");
        pizza2.setNumCheese(2);
        pizza2.setNumPepperoni(2);
        System.out.printf("Second Pizza: %s size, %d cheese, %d pepperoni, %d ham%n", pizza2.getSize(),
                pizza2.getNumCheese(), pizza2.getNumPepperoni(), pizza2.getNumHam());

        // Code to create an order
        PizzaOrder order1 = new PizzaOrder(pizza1, pizza2);

        // 2 pizzas in the order
        order1.setNumPizzas(2);

        // Set first pizza
        order1.setPizza1(pizza1);

        // Set second pizza
        order1.setPizza2(pizza2);

        // Should be 18+20 = 38
        double total = order1.calcTotal();
        System.out.printf("The total for your first order for %d pizza(s) is $%.2f%n", order1.getNumPizzas(), total);
        System.out.println(linebreak);

        // Use copyconstructor
        System.out.println("Copying your last order...");
        System.out.println("Starting your new order...");
        PizzaOrder order2 = new PizzaOrder(order1);

        // // Change toppings
        order2.getPizza1().setNumCheese(3);
        System.out.println("Adding more cheese to your first pizza...");
        System.out.println("Starting your new order...");
        System.out.printf("First Pizza: %s size, %d cheese, %d pepperoni, %d ham%n", order2.getPizza1().getSize(),
                order2.getPizza1().getNumCheese(), order2.getPizza1().getNumPepperoni(),
                order2.getPizza1().getNumHam());

        System.out.printf("Second Pizza: %s size, %d cheese, %d pepperoni, %d ham%n", order2.getPizza2().getSize(),
                order2.getPizza2().getNumCheese(), order2.getPizza2().getNumPepperoni(),
                order2.getPizza2().getNumHam());

        // Should be 22 + 20 = 42
        total = order2.calcTotal();
        System.out.printf("The total for your second order of %d pizza(s) is $%.2d%n", order2.getNumPizzas(), total);

        // Should still be 38
        double origTotal = order1.calcTotal();
        System.out.printf("Lastly, just double checking, the total for the first order is $%.2d%n", origTotal);
        System.out.println("Thanks for ordering!");

        keyboard.close();
    }
}
