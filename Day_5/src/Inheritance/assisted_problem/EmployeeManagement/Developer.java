package Inheritance.assisted_problem.EmployeeManagement;

public class Developer extends Employee {
    String programmingLanguage;
    Developer(String name,int id,double salary,String programmingLanguage){
        super(name,id,salary);
        this.programmingLanguage=programmingLanguage;
    }
    @Override
    void displayDetails(){
        System.out.println("Name of employee: "+name);
        System.out.println("id of employee: "+id);
        System.out.println("salary of employee: "+salary);
        System.out.println("Working Language: "+programmingLanguage);


    }
}
