import java.util.ArrayList;

import javax.swing.event.SwingPropertyChangeSupport;

public class Library {
    private ArrayList<Book> library = new ArrayList<>();

    public void addBook(Book b) {
        library.add(b);
    }

    public void printAllBooks() {
        library.forEach(b -> System.out.println(b.toString()));
    }
}
