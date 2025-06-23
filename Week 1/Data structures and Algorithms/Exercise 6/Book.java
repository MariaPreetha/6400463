// File: Book.java
public class Book {
    int bookId;
    String title;
    String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title.toLowerCase(); 
        this.author = author.toLowerCase();
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "[BookID: " + bookId + ", Title: " + title + ", Author: " + author + "]";
    }
}
