class Book {
    static String libraryName = "City Library";

    private final String isbn; // final unique_id
    private String title;
    private String author;

    Book(String isbn, String title, String author) {
        this.isbn = isbn; // 'this' used
        this.title = title;
        this.author = author;
    }

    void displayBook() {
        if (this instanceof Book) {
            System.out.println("[" + libraryName + "] Book: " + title + ", Author: " + author + ", ISBN: " + isbn);
        }
    }

    static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    public static void main(String[] args) {
        Book b1 = new Book("ISBN101", "Java Basics", "James");
        b1.displayBook();
        Book.displayLibraryName();
    }
}
