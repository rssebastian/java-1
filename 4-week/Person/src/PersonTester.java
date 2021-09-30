public class PersonTester {
    public static void main(String[] args) {
        Person John = new Person("John", "Johnson");
        Person Jacob = new Person("Jacob", "Jacobson");
        Person Jingleheimer = new Person("Jingleheimer", "Jingeheimerson");
        Person Schmidt = new Person("Schmidt", "Schmidtdaughter");

        String linebreak = "-----------------------------";
        System.out.println(linebreak);
        System.out.println("Test output for each person");
        System.out.println(linebreak);
        John.printFirstName();
        John.printLastName();
        John.printidNum();
        System.out.println(linebreak);
        Jacob.printFirstName();
        Jacob.printLastName();
        Jacob.printidNum();
        System.out.println(linebreak);
        Jingleheimer.printFirstName();
        Jingleheimer.printLastName();
        Jingleheimer.printidNum();
        System.out.println(linebreak);
        Schmidt.printFirstName();
        Schmidt.printLastName();
        Schmidt.printidNum();
        System.out.println(linebreak);
        System.out.println(linebreak);
        System.out.println("Testing each toString Method");
        System.out.println(linebreak);
        System.out.println(John.toString());
        System.out.println(Jacob.toString());
        System.out.println(Jingleheimer.toString());
    }
}

// TEST CASE OUTPUT
// -----------------------------
// Test output for each person
// -----------------------------
// This person's first name is John
// This person's last name is Johnson
// This person's ID Number is 1000
// -----------------------------
// This person's first name is Jacob
// This person's last name is Jacobson
// This person's ID Number is 1001
// -----------------------------
// This person's first name is Jingleheimer
// This person's last name is Jingeheimerson
// This person's ID Number is 1002
// -----------------------------
// This person's first name is Schmidt
// This person's last name is Schmidtdaughter
// This person's ID Number is 1003
// -----------------------------
// -----------------------------
// Testing each toString Method
// -----------------------------
// This person's name is John Johnson and their ID Number is 1000
// This person's name is Jacob Jacobson and their ID Number is 1001
// This person's name is Jingleheimer Jingeheimerson and their ID Number is 1002