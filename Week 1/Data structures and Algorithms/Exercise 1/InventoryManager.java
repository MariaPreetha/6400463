// File: InventoryManager.java
import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private Map<Integer, Product> inventory = new HashMap<>();

    public void addProduct(Product product) {
        if (inventory.containsKey(product.getProductId())) {
            System.out.println("Product ID already exists.");
        } else {
            inventory.put(product.getProductId(), product);
            System.out.println("Product added: " + product);
        }
    }

    public void updateProduct(int id, int quantity, double price) {
        Product product = inventory.get(id);
        if (product != null) {
            product.setQuantity(quantity);
            product.setPrice(price);
            System.out.println("Product updated: " + product);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct(int id) {
        if (inventory.remove(id) != null) {
            System.out.println("Product with ID " + id + " deleted.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void displayInventory() {
        System.out.println("\n--- Inventory ---");
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }
}
