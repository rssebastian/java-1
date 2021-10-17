public class Tester {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Doe", "Sales");
        System.out.println(employee.toString());

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Dohn", "Joe", "Marketing");
        System.out.println(fullTimeEmployee.toString());
        fullTimeEmployee.printSalary();
        fullTimeEmployee.setSalary(100000.00);
        fullTimeEmployee.printSalary();
        fullTimeEmployee.printBenefits();
        fullTimeEmployee.addBenefit("Medical");
        fullTimeEmployee.addBenefit("Dental");
        fullTimeEmployee.addBenefit("Free Lunch");
        fullTimeEmployee.printBenefits();
        fullTimeEmployee.removeBenefit("Free Lunch");
        fullTimeEmployee.printBenefits();

    }
}