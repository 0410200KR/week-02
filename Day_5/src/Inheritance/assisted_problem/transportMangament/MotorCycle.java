package Inheritance.assisted_problem.transportMangament;

public class MotorCycle extends Vehicle{
    String Brand;
    MotorCycle(int maxSpeed,String fuelType,String Brand){
        super(maxSpeed,fuelType);
        this.Brand=Brand;
    }
    @Override
    void displayInfo(){
        System.out.println("Maxspeed: "+maxSpeed);
        System.out.println("Fueltype: "+fuelType);
        System.out.println("Brand: "+Brand);
    }

}