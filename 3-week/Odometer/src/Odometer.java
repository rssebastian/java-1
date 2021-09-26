public class Odometer {
    // Miles driven and fuel efficiency
    private double milesDriven = 0;
    private double milesPerGallon = 0;

    // Reset odometer to 0 miles
    public void setToZero() {
        milesDriven = 0;
    }

    // Set fuel efficiency
    public void setFuelEfficiency(double mpg) {
        milesPerGallon = mpg;
    }

    // Take miles driven for a trip and add to odometer's total
    public void addToTotal(double miles) {
        milesDriven += miles;
    }

    // Gasoline consumed since last reset
    public double gasConsumed() {
        return milesDriven / milesPerGallon;
    }
}
