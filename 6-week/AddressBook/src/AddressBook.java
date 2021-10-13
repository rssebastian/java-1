import java.util.Arrays;

public class AddressBook {
    private int addressBookLength = 50;
    private Person[] peopleArr = new Person[addressBookLength];
    private int size = 0;

    // AddressBook() constructor to create an initialize the ad
    public AddressBook() {

    }

    // The add(Person p) method should add a person object to the address book. Make
    // sure that the add method does not add duplicate person objects to the address
    // book.
    public void add(Person p) {
        for (Person person : peopleArr) {
            if (person.getIdNum() == p.getIdNum()) {
                System.out.println("This person already exists, they cannot be added");
                System.exit(0);
            }
        }

        if (size >= addressBookLength) {
            peopleArr = Arrays.copyOf(peopleArr, 2 * peopleArr.length);
        }

        peopleArr[size] = p;
        size++;
    }

    // The delete(Person p) method should remove the specified person object from
    // the address book.
    public void delete(Person p) {

    }

    // The delete(int id) method should remove person object with the specified id
    // from the address book.
    public void delete(int id) {

    }

    // The search(String name) method that searches the address book for a specified
    // person and returns the list of persons matching name.
    public void search(String name) {

    }

    // The search(int id) method that searches the address book for the person with
    // the given id and returns the person object if found and none if the there is
    // no person object with that it in the address book.
    public void search(int id) {

    }

    // The print method to print all the person objects in the address book.
    public void print() {

    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
