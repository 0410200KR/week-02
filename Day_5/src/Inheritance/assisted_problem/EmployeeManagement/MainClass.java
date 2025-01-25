package Inheritance.assisted_problem.EmployeeManagement;

public class MainClass {
    public static void main(String[]args){
        Employee manager=new Manager("Ayan", 678, 1000000, 7) ;
        Employee developer=new Developer("Kanak", 78, 50000, "JAVA");
        Employee intern=new Intern("Aman", 11, 6000, 5);
        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }
}
