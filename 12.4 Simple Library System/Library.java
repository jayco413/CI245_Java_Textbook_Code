import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> books = new ArrayList<>();

    public Library(String name) {
        this.name = name;
    }

    public void addBook(Book b) {
        // ADD YOUR CODE HERE
    }

    public void borrowBook(String title) {
        // ADD YOUR CODE HERE
    }

    public void returnBook(String title) {
        // ADD YOUR CODE HERE
    }

    public Book findBook(String title) {
        // ADD YOUR CODE HERE
        return null;
    }

    public ArrayList<Book> getBooks() {
        // ADD YOUR CODE HERE -- return only the currently available books
        return null;
    }
}
