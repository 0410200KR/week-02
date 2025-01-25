package Inheritance.assisted_problem.EmployeeManagement;

public class Manager extends Employee{
    int teamSize;
    Manager(String name,int id,double salary,int teamSize){
        super(name,id,salary);
        this.teamSize=teamSize;
    }
    @Override
    void displayDetails(){
        System.out.println("Name of employee: "+name);
        System.out.println("id of employee: "+id);
        System.out.println("salary of employee: "+salary);
        System.out.println("Total Members: "+teamSize);


    }
}
