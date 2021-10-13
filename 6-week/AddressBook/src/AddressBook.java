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
            if (person == null) {
                break;
            }
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
        for (int i = 0; i < size; i++) {
            if (peopleArr[i] == p) {
                for (int j = i; j < size; j++) {
                    if (j + 1 == size) {
                        peopleArr[j] = null;
                    } else {
                        peopleArr[j] = peopleArr[j + 1];
                    }
                }
                break;
            }
        }
    }

    // The delete(int id) method should remove person object with the specified id
    // from the address book.
    public void delete(int id) {
        for (Person person : peopleArr) {
            if (person != null && person.getIdNum() == id) {
                delete(person);
                break;
            }
        }
    }

    // The search(String name) method that searches the address book for a specified
    // person and returns the list of persons matching name.
    public Person[] search(String name) {
        int matchesSize = 10;
        Person[] matches = new Person[matchesSize];
        int matchCount = 0;

        for (Person person : peopleArr) {
            if (person != null && person.getFullName().equals(name)) {
                if (matchCount == matchesSize) {
                    matches = Arrays.copyOf(matches, 2 * matches.length);
                }
                matches[matchCount] = person;
                matchCount++;
            }
        }
        return matches;
    }

    // The search(int id) method that searches the address book for the person with
    // the given id and returns the person object if found and none if the there is
    // no person object with that it in the address book.
    public Person search(int id) {
        for (Person person : peopleArr) {
            if (person != null && person.getIdNum() == id) {
                return person;
            }
        }
        return null;
    }

    // The print method to print all the person objects in the address book.
    public void print() {
        for (Person person : peopleArr) {
            if (person != null) {
                System.out.println(person.toString());
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
