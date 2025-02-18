package mentor30;

import java.util.UUID;

public class Book {
    private String uniqueID;
    private String title;
    private String author;
    private int year;
    private int availableCopy;

    public Book(String title, String author, int year, int availableCopy) {
        this.uniqueID = UUID.randomUUID().toString();;
        this.title = title;
        this.author = author;
        this.year = year;
        this.availableCopy = availableCopy;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAvailableCopy() {
        return availableCopy;
    }

    public void setAvailableCopy(int availableCopy) {
        this.availableCopy = availableCopy;
    }
}
