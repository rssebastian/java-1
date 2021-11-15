public class Thermostat {
    private int temperature;
    private int low;
    private int high;

    public Thermostat(int low, int high) {
        this.low = low;
        this.high = high;
    }

    public void setTemperature(int temperature) throws TemperatureTooLow, TemperatureTooHigh {
        if (temperature < low) {
            throw new TemperatureTooLow();
        } else if (temperature > high) {
            throw new TemperatureTooHigh();
        } else {
            this.temperature = temperature;
        }

    }

    public int getTemperature() {
        return temperature;
    }
}
