public class AddressBookTester {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Person person0 = new Person("Albert", "Albertson");
        Person person1 = new Person("Bill", "Bilson");
        Person person2 = new Person("Carl", "Carlson");
        Person person3 = new Person("Daniel", "Danielson");
        Person person4 = new Person("Edwina", "Edwindaughter");
        Person person5 = new Person("Bill", "Bilson");

        addressBook.add(person0);
        addressBook.add(person1);
        addressBook.add(person2);
        addressBook.add(person3);
        addressBook.add(person4);
        addressBook.add(person5);

        String linebreak = "----------------------------";
        System.out.println(linebreak);
        System.out.println(linebreak);
        System.out.println("Printing your initialized address book...");
        System.out.println(linebreak);
        addressBook.print();
        System.out.println(linebreak);
        System.out.println("You're searching for Bill Bilson? Let me see how many we have...");

        Person[] matches = addressBook.search("Bill Bilson");
        for (int i = 0; i < matches.length; i++) {
            if (matches[i] != null) {
                System.out.println("We found a " + matches[i].toString());
            }
        }
        System.out.println(linebreak);
        System.out.println("The second Bill Bilson needs to be removed? Let me work on that...");
        addressBook.delete(addressBook.search(1005));
        System.out.println("They were removed! Here's your updated address book");
        System.out.println(linebreak);
        addressBook.print();

    }
}

// TEST CASE OUTPUT
// ----------------------------
// ----------------------------
// Printing your initialized address book...
// ----------------------------
// Person: Albert Albertson, ID#: 1000
// Person: Bill Bilson, ID#: 1001
// Person: Carl Carlson, ID#: 1002
// Person: Daniel Danielson, ID#: 1003
// Person: Edwina Edwindaughter, ID#: 1004
// Person: Bill Bilson, ID#: 1005
// ----------------------------
// You're searching for Bill Bilson? Let me see how many we have...
// We found a Person: Bill Bilson, ID#: 1001
// We found a Person: Bill Bilson, ID#: 1005
// ----------------------------
// The second Bill Bilson needs to be removed? Let me work on that...
// They were removed! Here's your updated address book
// ----------------------------
// Person: Albert Albertson, ID#: 1000
// Person: Bill Bilson, ID#: 1001
// Person: Carl Carlson, ID#: 1002
// Person: Daniel Danielson, ID#: 1003
// Person: Edwina Edwindaughter, ID#: 1004