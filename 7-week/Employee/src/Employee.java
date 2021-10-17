public class Employee extends Person {
    private String department;

    public Employee(String fn, String ln) {
        super(fn, ln);
    }

    public Employee(String fn, String ln, String department) {
        super(fn, ln);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String toString() {
        return ("Person: " + getFullName() + ", ID#: " + getIdNum() + ", Department: " + getDepartment());
    }
}
