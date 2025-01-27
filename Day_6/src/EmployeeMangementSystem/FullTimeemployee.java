package EmployeeMangementSystem;

class FullTimeemployee extends Employee implements Department {
   private final double fixedSalary;
   private String department;
    FullTimeemployee(int employeeId,String name,double baseSalary,double fixedSalary){
        super(employeeId,name,baseSalary);
        this.fixedSalary=fixedSalary;
    }
    @Override
    double calculateSalary(){
        return  getBaseSalary()+fixedSalary;


    }
    @Override
    public void assignDepartment(String departmentName){
        this.department=departmentName;
    }
    @Override
    public String getDepartmentDetails(){
        return department;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Fixed salary: "+fixedSalary);
        System.out.println("department: "+department);
        System.out.println("Total salary: "+calculateSalary());
    }

}
