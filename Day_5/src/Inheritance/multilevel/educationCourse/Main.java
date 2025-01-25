package Inheritance.multilevel.educationCourse;

public class Main {
    public static void main(String[]args){
        Course onlineCourse=new OnlineCourse("java", 2, "GFG", "Yes");
        OnlineCourse paidOnlineCourse=new PaidOnlineCourse("python", 6, "Leetcode", "no", 50000, 700);
    }
}
