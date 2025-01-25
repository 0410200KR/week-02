package Inheritance.multilevel.educationCourse;

public class Course {
    String courseName;
    int duration;
    Course(String courseName,int duration){
        this.courseName=courseName;
        this.duration=duration;
        System.out.println("Name: "+courseName);
        System.out.println("Time: "+duration);
    }
}
