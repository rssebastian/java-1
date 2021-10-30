import java.util.ArrayList;

public class Book {
    private String title;
    private ArrayList<String> authors = new ArrayList<>();
    private String lccNum;
    private ArrayList<String> subjectHeadings = new ArrayList<>();
    private String publisher;
    private int yearPublished;
    private boolean isCirculating;

    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
