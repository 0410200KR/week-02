import java.util.ArrayList;
import java.util.List;

// Employee class
class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
    }
}

// Department class
class Department {
    String name;
    List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayDetails() {
        System.out.println("Department Name: " + name);
        System.out.println("Employees:");
        for (Employee employee : employees) {
            employee.displayDetails();
        }
    }
}

// Company class
class Company {
    String name;
    List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void displayDetails() {
        System.out.println("Company Name: " + name);
        for (Department department : departments) {
            department.displayDetails();
        }
    }

    // Deletes the company and its associated departments and employees
    public void deleteCompany() {
        departments.clear(); // Clears all departments and their employees
        System.out.println("Company " + name + " and all its departments and employees have been deleted.");
    }
}

// Main class
public class Composition {
    public static void main(String[] args) {
        // Create a company
        Company company = new Company("Capgemini");

        // Create departments
        Department dept1 = new Department("Engineering");
        Department dept2 = new Department("HR");

        // Add employees to departments
        dept1.addEmployee(new Employee("Ayan"));
        dept1.addEmployee(new Employee("Sakshi"));

        dept2.addEmployee(new Employee("Aman"));
        dept2.addEmployee(new Employee("Sahil"));

        // Add departments to the company
        company.addDepartment(dept1);
        company.addDepartment(dept2);

        // Display company details
        System.out.println("Before Deletion:");
        company.displayDetails();

        // Delete the company
        company.deleteCompany();
    }
}

