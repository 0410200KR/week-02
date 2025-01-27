package vehicleSystem;
import java.util.*;

public class Main {
    public static void calculateRentalAndInsurance(List<Vehicle> vehicles, int days) {
        for (Vehicle vehicle : vehicles) {
            double rentalCost = vehicle.calculateRentalCost(days);
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Type: " + vehicle.getType());
            System.out.println("Rental Cost for " + days + " day(s): " + rentalCost);

            System.out.println("------------------------------------");
        }
    }
    public static void main(String[] args) {
        // Create a list of vehicles
        List<Vehicle> vehicles = new ArrayList<>();

        // Add Car, Bike, and Truck
        Car car = new Car("C123", "Car", 1000, "CAR-INS-001");
        Bike bike = new Bike("B456", "Bike", 500, 50);
        Truck truck = new Truck("T789", "Truck", 2000, "TRUCK-INS-002");

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);

        // Calculate rental and insurance costs
        calculateRentalAndInsurance(vehicles, 3);
    }
}
