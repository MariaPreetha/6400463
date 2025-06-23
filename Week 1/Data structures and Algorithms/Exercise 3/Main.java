// File: Main.java
public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(101, "Aaron", 5000),
            new Order(102, "Benny", 12000),
            new Order(103, "Charlie", 3000),
            new Order(104, "David", 8000)
        };

        System.out.println("Sorted by Bubble Sort (descending):");
        SortUtils.bubbleSort(orders);
        SortUtils.printOrders(orders);

        orders = new Order[] {
            new Order(101, "Aaron", 5000),
            new Order(102, "Benny", 12000),
            new Order(103, "Charlie", 3000),
            new Order(104, "David", 8000)
        };

        System.out.println("\nSorted by Quick Sort (descending):");
        SortUtils.quickSort(orders, 0, orders.length - 1);
        SortUtils.printOrders(orders);
    }
}
