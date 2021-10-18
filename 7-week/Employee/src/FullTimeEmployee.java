public class FullTimeEmployee extends Employee {
    private double salary;
    private String[] benefits = new String[10];
    private int currentBenefits = 0;

    public FullTimeEmployee(String fn, String ln) {
        super(fn, ln);
    }

    public FullTimeEmployee(String fn, String ln, String department) {
        super(fn, ln, department);
    }

    public FullTimeEmployee(String fn, String ln, String department, double salary) {
        super(fn, ln, department);
        this.salary = salary;
    }

    public FullTimeEmployee(String fn, String ln, String department, double salary, String[] benefits) {
        super(fn, ln, department);
        this.salary = salary;
        for (int i = 0; i < benefits.length; i++) {
            if (benefits[i] != null) {
                this.benefits[currentBenefits] = benefits[currentBenefits];
                currentBenefits++;
            }
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printSalary() {
        if (salary > 0.0) {
            System.out.printf("Salary: $%.2f%n", salary);
        } else {
            System.out.println("No salary has been set yet");
        }

    }

    public String[] getBenefits() {
        return benefits;
    }

    public void removeBenefit(String benefit) {
        for (int i = 0; i < currentBenefits; i++) {
            if (benefits[i].equals(benefit)) {
                for (int j = i; j < currentBenefits; j++) {
                    if (j + 1 == benefits.length) {
                        benefits[j] = null;
                    } else {
                        benefits[j] = benefits[j + 1];
                    }
                }
                currentBenefits--;
            }
        }
    }

    public void addBenefit(String benefit) {
        if (currentBenefits == benefits.length) {
            System.out.println("You've reached the maximum number of benefits");
            return;
        }
        for (int i = 0; i < currentBenefits; i++) {
            if (benefits[i].equals(benefit)) {
                System.out.println("This benefit is already added.");
                return;
            }
        }
        benefits[currentBenefits] = benefit;
        currentBenefits++;
    }

    public void printBenefits() {
        System.out.print("Benefits: ");
        if (currentBenefits == 0) {
            System.out.print("No current benefits \r\n");
            return;
        }
        for (int i = 0; i < currentBenefits; i++) {
            if (i + 1 == currentBenefits) {
                System.out.print(benefits[i] + "\r\n");
            } else {
                System.out.print(benefits[i] + ", ");
            }
        }
    }
}