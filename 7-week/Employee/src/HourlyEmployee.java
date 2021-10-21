public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int totalHours;

    public HourlyEmployee(String fn, String ln) {
        super(fn, ln);
    }

    public HourlyEmployee(String fn, String ln, String department) {
        super(fn, ln, department);
    }

    public HourlyEmployee(String fn, String ln, String department, double hourlyRate) {
        super(fn, ln, department);
        this.hourlyRate = hourlyRate;
    }

    public HourlyEmployee(String fn, String ln, String department, double hourlyRate, int totalHours) {
        super(fn, ln, department);
        this.hourlyRate = hourlyRate;
        this.totalHours = totalHours;
    }

    public int getHours() {
        return totalHours;
    }

    public void setHours(int totalHours) {
        this.totalHours = totalHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void printHours() {
        if (totalHours > 0) {
            System.out.println("Total Hours over 4 weeks: " + getHours());
        } else {
            System.out.println("This employee has not worked for the past 4 weeks");
        }
    }

    public void printWeeklyAverage() {
        if (totalHours > 0) {
            System.out.println("Average Hours per week: " + getHours() / 4);
        } else {
            System.out.println("This employee has not worked for the past 4 weeks");
        }
    }

    public void printTotalWages() {
        System.out.printf("This employee earned $%.2f for the past 4 weeks.%n", getHours() * getHourlyRate());
    }

}
