public class Circle {
    double radius;
    public Circle(double radius){
        this.radius=radius;

    }
    public void display(double radius ){
        System.out.println("circumference of circle :"+Math.PI*radius*radius);
        System.out.println("area of circle : "+Math.PI*2*radius);

    }
    public static void main(String[]args){
        double radius=5.0;
         Circle obj=new Circle(radius);

        obj.display(radius);
    }
}
