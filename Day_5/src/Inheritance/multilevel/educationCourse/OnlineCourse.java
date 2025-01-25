package Inheritance.multilevel.educationCourse;

public class OnlineCourse extends Course{
    String platform;
    String isRecorded;
    OnlineCourse(String courseName,int duration,String platform,String isRecorded){
        super(courseName,duration);
        this.platform=platform;
        this. isRecorded=isRecorded;
        System.out.println("Platform: "+platform);
        System.out.println("Record: "+isRecorded);

    }
}
