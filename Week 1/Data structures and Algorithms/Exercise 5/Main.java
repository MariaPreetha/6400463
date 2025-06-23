// File: Main.java
public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.addTask(1, "Design DB schema", "Pending");
        manager.addTask(2, "Develop API", "In Progress");
        manager.addTask(3, "Write Tests", "Not Started");
        manager.displayTasks();
        Task found = manager.searchTask(2);
        System.out.println("\nSearch Result: " + (found != null ? found : "Task not found"));
        manager.deleteTask(1);
        manager.displayTasks();
    }
}
