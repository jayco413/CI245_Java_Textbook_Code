public class Book {

    private String title;
    private String author;
    private int year;
    private boolean isAvailable = true;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    @Override
    public String toString() {
        // ADD YOUR CODE HERE
        return null;
    }
}
