public class OdometerTester {
    public static void main(String[] args) {
        Odometer trip = new Odometer();
        String lineBreak = "-----------------------";

        System.out.println(lineBreak);
        System.out.println("Traveling 100 miles with a car 10mpg...");
        trip.addToTotal(100);
        trip.setFuelEfficiency(10);
        System.out.printf("You've consumed %.2f gallons of gasoline!%n", trip.gasConsumed());
        System.out.println(lineBreak);

        System.out.println("Switching cars...");
        System.out.println("Resetting odometer...");
        trip.setToZero();

        System.out.println(lineBreak);
        System.out.println("Traveling 212 miles with a car 18mpg...");
        trip.addToTotal(212);
        trip.setFuelEfficiency(18);
        System.out.printf("You've consumed %.2f gallons of gasoline!%n", trip.gasConsumed());
        System.out.println(lineBreak);

        System.out.println("Switching cars...");
        System.out.println("Resetting odometer...");
        trip.setToZero();

        System.out.println(lineBreak);
        System.out.println("Traveling 326 miles with a car 34mpg...");
        trip.addToTotal(326);
        trip.setFuelEfficiency(34);
        System.out.printf("You've consumed %.2f gallons of gasoline!%n", trip.gasConsumed());

        System.out.println(lineBreak);

        System.out.println("Switching cars...");
        System.out.println("Resetting odometer...");
        trip.setToZero();

        System.out.println(lineBreak);
        System.out.println("Traveling 80 miles with a car 11mpg...");
        trip.addToTotal(80);
        trip.setFuelEfficiency(11);
        System.out.printf("You've consumed %.2f gallons of gasoline!%n", trip.gasConsumed());
    }
}

// TEST CASE OUTPUT
// -----------------------
// Traveling 100 miles with a car 10mpg...
// You've consumed 10.00 gallons of gasoline!
// -----------------------
// Switching cars...
// Resetting odometer...
// -----------------------
// Traveling 212 miles with a car 18mpg...
// You've consumed 17.33 gallons of gasoline!
// -----------------------
// Switching cars...
// Resetting odometer...
// -----------------------
// Traveling 326 miles with a car 34mpg...
// You've consumed 18.76 gallons of gasoline!
// -----------------------
// Switching cars...
// Resetting odometer...
// -----------------------
// Traveling 80 miles with a car 11mpg...
// You've consumed 65.27 gallons of gasoline!