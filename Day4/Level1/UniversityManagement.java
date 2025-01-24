import java.util.ArrayList;
import java.util.List;

// Faculty class
class Faculty {
    String facultyName;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    // Display faculty details
    public void displayFacultyDetails() {
        System.out.println("Faculty Name: " + facultyName);
    }
}

// Department class
class Department {
    String departmentName;
    List<Faculty> faculties;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.faculties = new ArrayList<>();
    }

    // Add a faculty to the department
    public void addFaculty(Faculty faculty) {
        if (faculty != null) {
            faculties.add(faculty);
        }
    }

    // Display department details
    public void displayDepartmentDetails() {
        System.out.println("Department: " + departmentName);
        if (faculties.isEmpty()) {
            System.out.println("No faculties in this department.");
        } else {
            System.out.println("Faculties:");
            for (Faculty faculty : faculties) {
                faculty.displayFacultyDetails();
            }
        }
    }
}

// University class
class University {
    String universityName;
    List<Department> departments;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
    }

    // Add a department to the university
    public void addDepartment(Department department) {
        if (department != null) {
            departments.add(department);
        }
    }

    // Display university details
    public void displayUniversityDetails() {
        System.out.println("University: " + universityName);
        if (departments.isEmpty()) {
            System.out.println("No departments in this university.");
        } else {
            System.out.println("Departments:");
            for (Department department : departments) {
                department.displayDepartmentDetails();
            }
        }
    }

    // Delete the university (simulate by clearing all departments)
    public void deleteUniversity() {
        departments.clear();
        System.out.println("University and all its departments have been deleted.");
    }
}

// Main class
public class UniversityManagement {
    public static void main(String[] args) {
        // Create a university
        University university = new University("Tech University");

        // Create departments
        Department csDepartment = new Department("Computer Science");
        Department mechDepartment = new Department("Mechanical Engineering");

        // Create faculties
        Faculty faculty1 = new Faculty("alam");
        Faculty faculty2 = new Faculty("Dr. tina");
        Faculty faculty3 = new Faculty("sita");

        // Add faculties to departments
        csDepartment.addFaculty(faculty1);
        csDepartment.addFaculty(faculty2);
        mechDepartment.addFaculty(faculty3);

        // Add departments to university
        university.addDepartment(csDepartment);
        university.addDepartment(mechDepartment);

        // Display university details
        System.out.println("\nUniversity Details:");
        university.displayUniversityDetails();

        // Demonstrate independent faculty existence
        Faculty independentFaculty = new Faculty("Dr. David");
        System.out.println("\nIndependent Faculty:");
        independentFaculty.displayFacultyDetails();

        // Delete university and associated departments
        System.out.println("\nDeleting the university...");
        university.deleteUniversity();

        // Attempt to display university details after deletion
        System.out.println("\nUniversity Details After Deletion:");
        university.displayUniversityDetails();
    }
}
