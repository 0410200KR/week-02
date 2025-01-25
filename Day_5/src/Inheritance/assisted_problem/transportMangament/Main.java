package Inheritance.assisted_problem.transportMangament;

public class Main {
    public static void main(String[]args){
        Vehicle [] vehicletype=new Vehicle[3];
        vehicletype[0]=new Car(240,"diesel",7);
        vehicletype[1]=new Truck(200,"diesel","XOXO logicsatic");
        vehicletype[2]=new MotorCycle(140,"petrol","Honda");
        for (Vehicle vehicle : vehicletype) {
            System.out.println("Vehicle Info:");
            vehicle.displayInfo();
            System.out.println();}



    }
}
