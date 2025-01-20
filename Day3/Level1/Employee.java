public class Employee {
    static String companyName="capgemini";
    String name;
    final int id;
    String designation;
    static int total;
    public Employee(String name,int id,String designation){
        this.name=name;
        this.id=id;
        this.designation=designation;
        total++;

    }
    public static void displayTotalEmployee(){
        System.out.println("Total Employee:" +total);

    }
    void display(){
        System.out.println("Name:" +name);
        System.out.println("Id:" +id);
        System.out.println("Designation:" +designation);
    }
    public static void main(String[]args){
        Employee  em = new Employee ("KANAK",789,"PROJECT LEADER");
        if (em instanceof Employee ) { 
            System.out.println("Employee details are valid.");
        }
        em.display();
        Employee.displayTotalEmployee();
    }
    

    
}
