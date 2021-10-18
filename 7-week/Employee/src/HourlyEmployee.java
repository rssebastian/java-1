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

    public void printHours() {
        if (totalHours > 0) {
            System.out.println("Total Hours over 4 weeks: " + totalHours);
        } else {
            System.out.println("This employee has not worked for the past 4 weeks");
        }
    }

    public void printWeeklyAverage() {
        if (totalHours > 0) {
            System.out.println();
        }
    }
}
