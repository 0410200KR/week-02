public class Employee{
    String name;
    int id;
    int salary;
    public Employee(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
        
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Salary: "+salary);                            
    }
    public static void main(String[] args) {
        String name="kanak";
        int id=4;
        int salary=500000;
        Employee obj=new Employee(name,id,salary);
        obj.display();


    }

}
