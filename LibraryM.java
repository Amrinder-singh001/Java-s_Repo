class Book {

    String bookName;
    String author;

    Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    void display() {
        System.out.println("Book: " + bookName);
        System.out.println("Author: " + author);
    }
}

class LibraryM {
    public static void main(String[] args) {

        Book b1 = new Book("Java", "James Gosling");
        Book b2 = new Book("C++", "Bjarne");

        b1.display();
        b2.display();
    }
}