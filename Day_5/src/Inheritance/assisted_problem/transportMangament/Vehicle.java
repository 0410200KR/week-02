package Inheritance.assisted_problem.transportMangament;

public class Vehicle {
    public int maxSpeed;
    public String fuelType;
    Vehicle(int maxSpeed,String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }
    void displayInfo(){
        System.out.println("Maxspeed: "+maxSpeed);
        System.out.println("Fueltype: "+fuelType);
    }
}
