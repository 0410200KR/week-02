package EmployeeMangementSystem;

class PartTimeEmployee extends Employee implements Department {
    private double hourlyRate;
    private int hoursWorked;
    private String department;
    public PartTimeEmployee(int employeeId, String name, double baseSalary, double hourlyRate, int hoursWorked, String department){
        super(employeeId, name, baseSalary);
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
        this.department=department;
    }
    @Override
    public double calculateSalary(){
        return  getBaseSalary()+(hourlyRate* hoursWorked);
    }
    @Override
    public void assignDepartment(String departmentName){
        this.department=departmentName;
    }
    @Override
    public String getDepartmentDetails(){
        return  department;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Hourly Rate: "+hourlyRate);
        System.out.println("Hourly Worked: "+hoursWorked);
        System.out.println("Department: "+department);
        System.out.println("Total Salary: "+calculateSalary());
    }

}
