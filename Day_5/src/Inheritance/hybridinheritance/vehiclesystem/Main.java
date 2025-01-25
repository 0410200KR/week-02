package Inheritance.hybridinheritance.vehiclesystem;

public class Main {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200);
        PetrolVehicle pv = new PetrolVehicle("Ford Mustang", 250);

        ev.displayDetails();
        ev.charge();
        System.out.println();

        pv.displayDetails();
        pv.refuel();
    }
}
