// File: Main.java
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Shoes", "Footwear"),
            new Product(2, "Shirt", "Apparel"),
            new Product(3, "Laptop", "Electronics"),
            new Product(4, "Phone", "Electronics"),
            new Product(5, "Watch", "Accessories")
        };

        Product result1 = SearchUtil.linearSearch(products, "Laptop");
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Not Found"));

        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        Product result2 = SearchUtil.binarySearch(products, "Laptop");
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not Found"));
    }
}
