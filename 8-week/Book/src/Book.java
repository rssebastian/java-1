import java.util.ArrayList;

public class Book {
    private String title;
    private ArrayList<String> authors = new ArrayList<>();
    private String lccNum;
    private ArrayList<String> subjectHeadings = new ArrayList<>();
    private String publisher;
    private int yearPublished;
    private boolean isCirculating;

    // Title getter and setter
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Authors getter and setter
    public ArrayList<String> getAuthors() {
        return this.authors;
    }

    public void setAuthors(String[] authors) {
        for (int i = 0; i < authors.length; i++) {
            this.authors.add(authors[i]);
        }
    }

    // LCC Num getter and setter
    public String getLcc() {
        return lccNum;
    }

    public void setLcc(String lccNum) {
        this.lccNum = lccNum;
    }

    // Subject Heading getter and setter
    public ArrayList<String> getSubjects() {
        return this.subjectHeadings;
    }

    public void setSubjects(String[] subjects) {
        for (int i = 0; i < subjects.length; i++) {
            this.subjectHeadings.add(subjects[i]);
        }
    }

    // Publisher getter and setter
    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // Published year getter and setter
    public int getYear() {
        return this.yearPublished;
    }

    public void setYear(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    // Circulating getter and setter
    public boolean getCirculating() {
        return this.isCirculating;
    }

    public void setCirculation(boolean circulating) {
        this.isCirculating = circulating;
    }

    public String toString() {
        String titleStr = "Title: " + getTitle() + ", \r\n";
        String authorStr = "Author(s): ";
        for (String author : getAuthors()) {
            authorStr += author + ", ";
        }
        authorStr += "\r\n";
        String lccStr = "LCC Number: " + getLcc() + ", \r\n";
        String subjectStr = "Subject(s): ";
        for (String subject : getSubjects()) {
            subjectStr += subject + ", ";
        }
        subjectStr += ", \r\n";
        String pubStr = "Publisher: " + getPublisher() + ", \r\n";
        String yearStr = "Year Published: " + String.valueOf(getYear()) + ", \r\n";
        String circStr = "Circulating: " + String.valueOf(getCirculating()) + "\r\n";
        return titleStr + authorStr + lccStr + subjectStr + pubStr + yearStr + circStr;
    }
}
