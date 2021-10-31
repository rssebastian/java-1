public class LibraryTester {
    public static void main(String[] args) {
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

    }

}
