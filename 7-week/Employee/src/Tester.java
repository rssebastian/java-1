public class Tester {
    public static void main(String[] args) {
        String linebreak = "--------------------";
        System.out.println(linebreak);
        System.out.println("Testing Employee Class...");
        Employee employee1 = new Employee("John", "Doe");
        System.out.println(employee1.toString());
        System.out.println("Adding Sales Department...");
        employee1.setDepartment("Sales");
        System.out.println(employee1.toString());
        Employee employee2 = new Employee("Dohn", "Joe", "Marketing");
        System.out.println(employee2.toString());
        System.out.println(linebreak);

        System.out.println("Testing FullTimeEmployee Class...");
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Albert", "Albertson", "Recruiting");
        System.out.println(fullTimeEmployee.toString());
        System.out.println("Getting + Setting Salary...");
        fullTimeEmployee.printSalary();
        fullTimeEmployee.setSalary(100000.00);
        fullTimeEmployee.printSalary();
        fullTimeEmployee.printBenefits();
        System.out.println("Getting + Setting Benefits...");
        fullTimeEmployee.addBenefit("Medical");
        fullTimeEmployee.addBenefit("Dental");
        fullTimeEmployee.addBenefit("Free Lunch");
        fullTimeEmployee.printBenefits();
        fullTimeEmployee.removeBenefit("Free Lunch");
        fullTimeEmployee.printBenefits();

        System.out.println(linebreak);

    }
}