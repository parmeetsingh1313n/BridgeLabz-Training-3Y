// Superclass Book
class Book {
    String title;
    int pubYear;

    Book(String title, int pubYear) {
        this.title = title;
        this.pubYear = pubYear;
    }

    void displayInfo() {
        System.out.println("Book: " + title + " (" + pubYear + ")");
    }
}

// Subclass Author extends Book
class Author extends Book {
    String name;
    String bio;

    Author(String title, int pubYear, String name, String bio) {
        super(title, pubYear); // call Book constructor
        this.name = name;
        this.bio = bio;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name + " | Bio: " + bio);
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        Author a1 = new Author("Java Basics", 2023, "James Gosling", "Creator of Java");
        a1.displayInfo();
    }
}
