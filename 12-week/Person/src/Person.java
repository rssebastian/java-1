import java.util.Arrays;

public class Person implements Comparable<Person> {
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
        System.out.println("First Name: " + firstName);
    }

    public void printLastName() {
        System.out.println("Last Name: " + lastName);
    }

    public void printidNum() {
        System.out.println("ID#: " + idNum);
    }

    public String toString() {
        return ("Person: " + getFullName() + ", ID#: " + getIdNum());
    }

    // Sorts by ascending ID Number
    // public int compareTo(Person o) {
    // if (this.getIdNum() == o.getIdNum())
    // return 0;
    // else if (this.getIdNum() > o.getIdNum())
    // return 1;
    // else
    // return -1;
    // }

    // Sorts lexicographically by last name
    public int compareTo(Person o) {
        return this.getLastName().compareTo(o.getLastName());
    }

    public static void main(String[] args) {
        Person p0 = new Person("Andrew", "Andrewson");
        Person p1 = new Person("Ben", "Benson");
        Person p2 = new Person("Christian", "Christianson");
        Person p3 = new Person("Dave", "Davidson");
        Person p4 = new Person("Eric", "Erickson");
        Person p5 = new Person("Frank", "Frankenson");
        Person p6 = new Person("Gabriel", "Gabrielson");
        Person p7 = new Person("Harrison", "Harrisonson");
        Person p8 = new Person("Igor", "Igorson");
        Person p9 = new Person("James", "Jameson");

        Person[] people = new Person[10];
        people[0] = p2;
        people[1] = p7;
        people[2] = p6;
        people[3] = p4;
        people[4] = p5;
        people[5] = p0;
        people[6] = p3;
        people[7] = p9;
        people[8] = p1;
        people[9] = p8;

        String linebreak = "------------------------";
        System.out.println("Unsorted Array:");
        System.out.println(linebreak);
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].toString());
        }
        System.out.println(linebreak);
        System.out.println("Sorting Array...");
        Arrays.sort(people);
        System.out.println(linebreak);

        System.out.println("Sorted by ascending ID Number:");
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].toString());
        }
    }
}

// TEST CASE OUTPUT for sorting by ascending ID Number
// Unsorted Array:
// ------------------------
// Person: Christian Christianson, ID#: 1002
// Person: Harrison Harrisonson, ID#: 1007
// Person: Gabriel Gabrielson, ID#: 1006
// Person: Eric Erickson, ID#: 1004
// Person: Frank Frankenson, ID#: 1005
// Person: Andrew Andrewson, ID#: 1000
// Person: Dave Davidson, ID#: 1003
// Person: James Jameson, ID#: 1009
// Person: Ben Benson, ID#: 1001
// Person: Igor Igorson, ID#: 1008
// ------------------------
// Sorting Array...
// ------------------------
// Sorted by ascending ID Number:
// Person: Andrew Andrewson, ID#: 1000
// Person: Ben Benson, ID#: 1001
// Person: Christian Christianson, ID#: 1002
// Person: Dave Davidson, ID#: 1003
// Person: Eric Erickson, ID#: 1004
// Person: Frank Frankenson, ID#: 1005
// Person: Gabriel Gabrielson, ID#: 1006
// Person: Harrison Harrisonson, ID#: 1007
// Person: Igor Igorson, ID#: 1008
// Person: James Jameson, ID#: 1009

// TEST CASE OUTPUT for sorting lexicographic ordering of last name
// Unsorted Array:
// ------------------------
// Person: Christian Christianson, ID#: 1002
// Person: Harrison Harrisonson, ID#: 1007
// Person: Gabriel Gabrielson, ID#: 1006
// Person: Eric Erickson, ID#: 1004
// Person: Frank Frankenson, ID#: 1005
// Person: Andrew Andrewson, ID#: 1000
// Person: Dave Davidson, ID#: 1003
// Person: James Jameson, ID#: 1009
// Person: Ben Benson, ID#: 1001
// Person: Igor Igorson, ID#: 1008
// ------------------------
// Sorting Array...
// ------------------------
// Sorted by ascending ID Number:
// Person: Andrew Andrewson, ID#: 1000
// Person: Ben Benson, ID#: 1001
// Person: Christian Christianson, ID#: 1002
// Person: Dave Davidson, ID#: 1003
// Person: Eric Erickson, ID#: 1004
// Person: Frank Frankenson, ID#: 1005
// Person: Gabriel Gabrielson, ID#: 1006
// Person: Harrison Harrisonson, ID#: 1007
// Person: Igor Igorson, ID#: 1008
// Person: James Jameson, ID#: 1009