public class Person {
    private String firstName;
    private String lastName;
    private static int idNumCounter = 1000;
    private int idNum = idNumCounter;

    public Person(String fn, String ln) {
        firstName = fn;
        lastName = ln;
        idNumCounter++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getIdNum() {
        return idNum;

    }

    public void printFirstName() {
        System.out.println("This person's first name is " + firstName);
    }

    public void printLastName() {
        System.out.println("This person's last name is " + lastName);
    }

    public void printidNum() {
        System.out.println("This person's ID Number is " + idNum);
    }

    public String toString() {
        return ("Person: " + getFullName() + ", ID#: " + getIdNum());
    }
}
