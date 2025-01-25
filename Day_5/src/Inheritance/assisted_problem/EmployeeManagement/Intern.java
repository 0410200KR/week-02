package Inheritance.assisted_problem.EmployeeManagement;

public class Intern extends Employee {
    int Duration;
    Intern(String name,int id,double salary, int Duration){
        super(name,id,salary);
        this.Duration=Duration;
    }
    @Override
    void displayDetails(){
        System.out.println("Name of employee: "+name);
        System.out.println("id of employee: "+id);
        System.out.println("salary of employee: "+salary);
        System.out.println("Time of internship: "+Duration+" months");


    }
}
