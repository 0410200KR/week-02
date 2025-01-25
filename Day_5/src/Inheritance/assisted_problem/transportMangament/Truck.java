package Inheritance.assisted_problem.transportMangament;

public class Truck extends Vehicle{
    String company;
    Truck(int maxSpeed,String fuelType, String company){
        super(maxSpeed,fuelType);
        this.company=company;
    }
    @Override
    void displayInfo(){
        System.out.println("Maxspeed: "+maxSpeed);
        System.out.println("Fueltype: "+fuelType);

        System.out.println("Company: "+company);
    }

}