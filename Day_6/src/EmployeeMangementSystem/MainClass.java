package EmployeeMangementSystem;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Employee>employeeList=new ArrayList<>();
        FullTimeemployee fullemployee=new FullTimeemployee(1,"Rashmi",4000,70000);
        fullemployee.assignDepartment("Engineering");
        employeeList.add(fullemployee);
        PartTimeEmployee partemployee=new PartTimeEmployee(7,"Tina",50000,1000,2,"IT");
        fullemployee.assignDepartment("Engineering");
        employeeList.add(partemployee);
        for(Employee emp:employeeList){
            emp.displayDetails();
        System.out.println("-----------------------");}
    }
}
