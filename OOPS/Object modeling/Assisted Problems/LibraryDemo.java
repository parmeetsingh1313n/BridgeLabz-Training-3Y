import java.util.*;

// Book can exist independently of a Library
class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void showBook() {
        System.out.println(title + " by " + author);
    }
}

// Library aggregates Books
class Library {
    String name;
    ArrayList<Book> books;

    Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    void addBook(Book b) {
        books.add(b);
    }

    void showBooks() {
        System.out.println("Books in " + name + ":");
        for (Book b : books) {
            b.showBook();
        }
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling");
        Book b2 = new Book("Python Guide", "Guido van Rossum");

        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");

        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2);

        lib1.showBooks();
        lib2.showBooks();
    }
}
