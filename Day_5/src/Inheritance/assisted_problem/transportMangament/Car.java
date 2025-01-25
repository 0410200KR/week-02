package Inheritance.assisted_problem.transportMangament;

public class Car extends Vehicle{
    int carCapcity;
    Car(int maxSpeed,String fuelType,int carCapcity){
        super(maxSpeed,fuelType);
        this.carCapcity=carCapcity;
    }
    @Override
    void displayInfo(){
        System.out.println("Maxspeed: "+maxSpeed);
        System.out.println("Fueltype: "+fuelType);
        System.out.println("Capcity: "+carCapcity);
    }

}
