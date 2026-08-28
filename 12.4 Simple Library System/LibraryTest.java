import java.util.List;

public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library("Central Library");

        System.out.println("Testing adding books to the library:");
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        library.addBook(book1);
        Book book2 = new Book("Pride and Prejudice", "Jane Austen", 1813);
        library.addBook(book2);
        System.out.println();

        System.out.println("Testing borrowing a book:");
        library.borrowBook("The Great Gatsby");
        System.out.println();

        System.out.println("Testing finding a book that doesn't exist:");
        Book book3 = library.findBook("Moby Dick");
        System.out.println(
            book3 == null ?
            "The book 'Moby Dick' was not found in the library." : book3);
        System.out.println();

        System.out.println("Testing finding a book that does exist:");
        Book book4 = library.findBook("Pride and Prejudice");
        System.out.println("Found the book: " + book4);
        System.out.println();

        System.out.println("Testing printing the contents of the library:");
        List<Book> books = library.getBooks();
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println();

        System.out.println("Returning the borrowed book and reprinting:");

        library.returnBook("The Great Gatsby");

        books = library.getBooks();
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
