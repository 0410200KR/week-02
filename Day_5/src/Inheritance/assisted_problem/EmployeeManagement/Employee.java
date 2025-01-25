package Inheritance.assisted_problem.EmployeeManagement;

public class Employee {
    public String name;
    public int id;
    public double salary;
    Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void displayDetails(){
        System.out.println("Name of employee: "+name);
        System.out.println("id of employee: "+id);
        System.out.println("salary of employee: "+salary);

    }
}
