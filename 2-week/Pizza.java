import java.text.NumberFormat;

public class Pizza {
    private String size;
    private int numCheese;
    private int numPepperoni;
    private int numHam;

    public Pizza() {
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String pizzaSize) {
        pizzaSize = pizzaSize.toLowerCase();
        if (pizzaSize.equals("small") || pizzaSize.equals("medium") || pizzaSize.equals("large")) {
            this.size = pizzaSize;
        } else {
            System.out.println(("Error: Invalid size"));
            System.exit(0);
        }

    }

    public int getNumCheese() {
        return this.numCheese;
    }

    public void setNumCheese(int cheeseTop) {
        this.numCheese = cheeseTop;
    }

    public int getNumPepperoni() {
        return this.numPepperoni;
    }

    public void setNumPepperoni(int pepperoniTop) {
        this.numPepperoni = pepperoniTop;
    }

    public int getNumHam() {
        return this.numHam;
    }

    public void setNumHam(int hamTop) {
        this.numHam = hamTop;
    }

    public double calcCost() {
        float baseCost = 0;
        switch (this.size) {
            case "small":
                baseCost = 10;
                break;
            case "medium":
                baseCost = 12;
                break;
            case "large":
                baseCost = 14;
                break;
        }
        return baseCost + (2 * this.numCheese) + (2 * this.numPepperoni) + (2 * this.numHam);
    }

    public String getDescription() {
        return "You ordered a " + this.size + " pizza with " + this.numCheese + " cheese topping(s), "
                + this.numPepperoni + " pepperoni topping(s), and " + this.numHam
                + " ham topping(s)! Your total cost is " + NumberFormat.getCurrencyInstance().format(calcCost()) + "!";
    }
}
