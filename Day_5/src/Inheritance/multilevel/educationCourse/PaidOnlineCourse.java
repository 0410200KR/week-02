package Inheritance.multilevel.educationCourse;

public class PaidOnlineCourse extends OnlineCourse{
    int fee;
    double discount;
    PaidOnlineCourse (String courseName,int duration,String platform,String isRecorded,int fee,double discount){
        super(courseName,duration,platform,isRecorded);
        this.fee=fee;
        this. discount=discount;
        System.out.println("Fee: "+fee);
        System.out.println("Discount: "+discount);

    }
}

