// File: Main.java
public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "Java Programming", "Maria"),
            new Book(2, "Data Structures", "Michael"),
            new Book(3, "Operating Systems", "Jayaraj"),
            new Book(4, "Design Patterns", "Gladis")
        };

        System.out.println("All Books:");
        Library.displayBooks(books);

        String searchTitle = "data structures";
        Book result1 = Library.linearSearch(books, searchTitle);
        System.out.println("\nLinear Search Result: " + (result1 != null ? result1 : "Not Found"));

        Library.sortBooksByTitle(books);

        Book result2 = Library.binarySearch(books, searchTitle);
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not Found"));
    }
}
