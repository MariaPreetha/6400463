// File: Library.java
import java.util.Arrays;
import java.util.Comparator;

public class Library {

    public static Book linearSearch(Book[] books, String targetTitle) {
        targetTitle = targetTitle.toLowerCase();
        for (Book book : books) {
            if (book.getTitle().equals(targetTitle)) {
                return book;
            }
        }
        return null;
    }

    public static Book binarySearch(Book[] books, String targetTitle) {
        targetTitle = targetTitle.toLowerCase();
        int left = 0, right = books.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = books[mid].getTitle().compareTo(targetTitle);

            if (cmp == 0) return books[mid];
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }

        return null;
    }

    public static void sortBooksByTitle(Book[] books) {
        Arrays.sort(books, Comparator.comparing(Book::getTitle));
    }

    public static void displayBooks(Book[] books) {
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
