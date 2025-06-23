// File: Main.java
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Maria Preetha", "S101", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);
        controller.updateView();
        controller.setStudentName("Michael Pradeep");
        controller.setStudentGrade("A+");
        controller.updateView();
    }
}
