import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.event.SwingPropertyChangeSupport;

public class Library {
    private ArrayList<Book> library = new ArrayList<>();

    public void addBook(Book b) {
        library.add(b);
    }

    public void printAllBooks() {
        library.forEach(b -> System.out.println(b.toString()));
    }

    public void SearchBySubject(String s) {
        ArrayList<Book> results = new ArrayList<>();
        for (Book b : library) {
            String[] titleWords = b.getTitle().split(" ");
            boolean inTitle = Arrays.asList(titleWords).contains(s);
            if (inTitle) {
                results.add(b);
            } else {
                boolean inSubjects = b.getSubjects().contains(s);
                if (inSubjects) {
                    results.add(b);
                }
            }
        }
        for (Book b : results) {
            String titleStr = "Title: " + b.getTitle() + ", ";
            String authorStr = "Author(s): ";
            for (String author : b.getAuthors()) {
                authorStr += author + ", ";
            }
            String lccStr = "LCC Number: " + b.getLcc();
            System.out.println(titleStr + authorStr + lccStr);
        }
    }
}
