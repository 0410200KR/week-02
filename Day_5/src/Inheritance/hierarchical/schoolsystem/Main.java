package Inheritance.hierarchical.schoolsystem;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Alice", 30, "Mathematics");
        Student student = new Student("Bob", 16, "10th Grade");
        Staff staff = new Staff("Charlie", 40, "Administration");

        teacher.displayDetails();
        teacher.displayRole();
        System.out.println();

        student.displayDetails();
        student.displayRole();
        System.out.println();

        staff.displayDetails();
        staff.displayRole();
    }
}
