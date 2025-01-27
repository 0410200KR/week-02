package EmployeeMangementSystem;

abstract class  Employee {
    private int employeeId;
    private String name;
    private double baseSalary;
    Employee(int employeeId,String name,double baseSalary){
        this.employeeId=employeeId;
        this.name=name;
        this.baseSalary=baseSalary;
    }
    public int getEmployeeId(){
        return employeeId;
    }
    public void setEmployeeId(int employeeId){
        this.employeeId=employeeId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    public void setName(double baseSalary){
        this.baseSalary=baseSalary;
    }
    abstract double calculateSalary();
    void displayDetails(){
        System.out.println("EmployeeId: "+employeeId);
        System.out.println("Name: "+name);
        System.out.println("BaseSalary: "+baseSalary);


    }









}
