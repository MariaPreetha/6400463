// File: Main.java
public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        manager.addEmployee(new Employee(1, "Maria", "Manager", 75000));
        manager.addEmployee(new Employee(2, "Michael", "Engineer", 60000));
        manager.addEmployee(new Employee(3, "Monisha", "Technician", 45000));

        manager.displayAllEmployees();

        Employee found = manager.searchEmployee(2);
        System.out.println("\nSearch Result: " + (found != null ? found : "Not found"));

        manager.deleteEmployee(1);
        manager.displayAllEmployees();
    }
}
