import java.util.ArrayList;
import java.util.List;

// Course class
class Course {
    String courseName;
    List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    // Enroll a student in this course
    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            // Maintain bidirectional association
            student.enrollInCourse(this); 
        }
    }

    // Display the students enrolled in this course
    public void displayEnrolledStudents() {
        System.out.println("Course: " + courseName);
        System.out.println("Enrolled Students:");
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.studentName);
        }
    }
}

// Student class
class Student {
    String studentName;
    List<Course> enrolledCourses;

    public Student(String studentName) {
        this.studentName = studentName;
        this.enrolledCourses = new ArrayList<>();
    }

    // Enroll in a course
    public void enrollInCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
             // Maintain bidirectional association
            course.enrollStudent(this);
        }
    }

    // Display the courses this student is enrolled in
    public void displayEnrolledCourses() {
        System.out.println("Student: " + studentName);
        System.out.println("Enrolled Courses:");
        for (Course course : enrolledCourses) {
            System.out.println("- " + course.courseName);
        }
    }
}

// School class
class School {
    String schoolName;
    List<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    // Add a student to the school
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // Display all students in the school
    public void displayStudents() {
        System.out.println("School: " + schoolName);
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println("- " + student.studentName);
        }
    }
}

// Main class
public class SchoolManagement {
    public static void main(String[] args) {
        // Create a school
        School school = new School(" High School");

        // Create students
        Student student1 = new Student("Ayesha");
        Student student2 = new Student("Rani");

        // Add students to the school (Aggregation relationship)
        school.addStudent(student1);
        school.addStudent(student2);

        // Create courses
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Science");

        // Students enroll in courses (Many-to-many association)
        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course1);

        // Display school details
        school.displayStudents();

        // Display courses each student is enrolled in
        student1.displayEnrolledCourses();
        student2.displayEnrolledCourses();

        // Display students enrolled in each course
        course1.displayEnrolledStudents();
        course2.displayEnrolledStudents();
    }
}
