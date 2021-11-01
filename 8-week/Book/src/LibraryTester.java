public class LibraryTester {
    public static void main(String[] args) {
        String linebreak = "--------------------";
        Library lib = new Library();

        Book testBook1 = new Book();
        testBook1.setTitle("The Three Musketeers");
        testBook1.setAuthors(new String[] { "Alexandre Dumas" });
        testBook1.setLcc("TB0123456789");
        testBook1.setSubjects(new String[] { "Action and Adventure", "Fiction", "Comedy" });
        testBook1.setPublisher("CreateSpace Independent Publishing Platform");
        testBook1.setYear(2014);
        testBook1.setCirculation(true);
        lib.addBook(testBook1);

        Book testBook2 = new Book();
        testBook2.setTitle("The Life of Pi");
        testBook2.setAuthors(new String[] { "Jack London" });
        testBook2.setLcc("TB1234567890");
        testBook2.setSubjects(new String[] { "Action and Adventure", "Fiction", "Short Story" });
        testBook2.setPublisher("CreateSpace Independent Publishing Platform");
        testBook2.setYear(2020);
        testBook2.setCirculation(true);
        lib.addBook(testBook2);

        Book testBook3 = new Book();
        testBook3.setTitle("To Kill a Mockingbird");
        testBook3.setAuthors(new String[] { "Harper Lee" });
        testBook3.setLcc("TB2345678901");
        testBook3.setSubjects(new String[] { "Classic", "Fiction" });
        testBook3.setPublisher("Harper Perennial");
        testBook3.setYear(2002);
        testBook3.setCirculation(true);
        lib.addBook(testBook3);

        Book testBook4 = new Book();
        testBook4.setTitle("The Adventures of Sherlock Holmes");
        testBook4.setAuthors(new String[] { "Sir Arthur Conan Doyle" });
        testBook4.setLcc("TB3456789012");
        testBook4.setSubjects(new String[] { "Classic", "Mystery" });
        testBook4.setPublisher("CreateSpace Independent Publishing Platform");
        testBook4.setYear(2002);
        testBook4.setCirculation(true);
        lib.addBook(testBook4);

        Book testBook5 = new Book();
        testBook5.setTitle("Little Women");
        testBook5.setAuthors(new String[] { "Louisa May Alcott" });
        testBook5.setLcc("TB4567890123");
        testBook5.setSubjects(new String[] { "Classic", "Fiction" });
        testBook5.setPublisher("Little, Brown and Company");
        testBook5.setYear(2018);
        testBook5.setCirculation(true);
        lib.addBook(testBook5);

        Book testBook6 = new Book();
        testBook6.setTitle("And Then There Were None");
        testBook6.setAuthors(new String[] { "Agatha Christie" });
        testBook6.setLcc("TB5678901234");
        testBook6.setSubjects(new String[] { "Mystery", "Fiction" });
        testBook6.setPublisher("William Morrow");
        testBook6.setYear(2011);
        testBook6.setCirculation(true);
        lib.addBook(testBook6);

        Book testBook7 = new Book();
        testBook7.setTitle("The Haunting of Hill House");
        testBook7.setAuthors(new String[] { "Shirley Jackson" });
        testBook7.setLcc("TB6789012345");
        testBook7.setSubjects(new String[] { "Horror", "Fiction" });
        testBook7.setPublisher("Penguin Classics");
        testBook7.setYear(2006);
        testBook7.setCirculation(true);
        lib.addBook(testBook7);

        Book testBook8 = new Book();
        testBook8.setTitle("Bird Box");
        testBook8.setAuthors(new String[] { "Josh Malerman" });
        testBook8.setLcc("TB7890123456");
        testBook8.setSubjects(new String[] { "Horror", "Fiction" });
        testBook8.setPublisher("Ecco");
        testBook8.setYear(2014);
        testBook8.setCirculation(true);
        lib.addBook(testBook8);

        Book testBook9 = new Book();
        testBook9.setTitle("Brazen and the Beast");
        testBook9.setAuthors(new String[] { "Sarah MacLean" });
        testBook9.setLcc("TB8901234567");
        testBook9.setSubjects(new String[] { "Romance", "Fiction" });
        testBook9.setPublisher("Avon");
        testBook9.setYear(2019);
        testBook9.setCirculation(true);
        lib.addBook(testBook9);

        Book testBook10 = new Book();
        testBook10.setTitle("The Hunger Games");
        testBook10.setAuthors(new String[] { "Suzanne Collins" });
        testBook10.setLcc("TB9012345678");
        testBook10.setSubjects(new String[] { "Sci-Fi", "Fiction", "Action and Adventure" });
        testBook10.setPublisher("Scholastic Inc.");
        testBook10.setYear(2011);
        testBook10.setCirculation(true);
        lib.addBook(testBook10);

        System.out.println(linebreak);
        System.out.println(linebreak);
        System.out.println("Printing all books...");
        lib.printAllBooks();
        System.out.println(linebreak);
        System.out.println(linebreak);
        System.out.println("Testing SearchBySubject...");
        System.out.println("Searching for 'Fiction'...");
        lib.SearchBySubject("Fiction");
        System.out.println(linebreak);
        System.out.println("Searching for 'The'...");
        lib.SearchBySubject("The");
        System.out.println(linebreak);
        System.out.println("Searching for 'Action and Adventure'...");
        lib.SearchBySubject("Action and Adventure");
        System.out.println(linebreak);
        System.out.println("Searching for 'Classic'...");
        lib.SearchBySubject("Classic");
    }
}
