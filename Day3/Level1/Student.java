public class Student {
    static String universityName="RGVP";
    final int rollNumber;
    String name;
    String grade;
    static int total=0;
    public Student(int rollNumber,String name,String grade){
       
        this.rollNumber=rollNumber;
        this.name=name;
        this.grade=grade;
        total++;

    }
   /*  public void updateGrade(String grade ){

    }*/
    void display(){
        
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        
    }


    public static void displayTotalStudents(){
        System.out.println("Total students enrolled in " + universityName + ": " + total);

    }
    public static void main(String[]args){
        Student obj=new Student(12,"kanak","A");
        Student obj2=new Student(13,"Ayan","A");
        if (obj instanceof Student ) { 
            System.out.println("Student details are valid.");
        }
        obj.display();
        
        if (obj2 instanceof Student ) { 
            System.out.println("Student details are valid.");
            obj2.display();
            Student.displayTotalStudents();
        }

    }
}
