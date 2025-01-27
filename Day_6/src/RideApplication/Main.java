package RideApplication;

public class Main {
    public static void processRide(Vehicle vehicle, double distance) {
        vehicle.getVehicleDetails();
        System.out.println("Total Fare: " + vehicle.calculateFare(distance));
    }

    public static void main(String[] args) {
        Vehicle car = new Car("C001", "Ayan", 15, "Downtown");
        Vehicle bike = new Bike("B0013", "kanak", 10, "Uptown");
        Vehicle auto = new Auto("A001", "paras", 12, "Midtown");

        // Process rides
        processRide(car, 10);
        System.out.println("Current Location: " + ((GPS) car).getCurrentLocation());
        ((GPS) car).updateLocation("Suburbs");
        System.out.println("Updated Location: " + ((GPS) car).getCurrentLocation());

        System.out.println();

        processRide(bike, 5);
        System.out.println("Current Location: " + ((GPS) bike).getCurrentLocation());
        ((GPS) bike).updateLocation("Downtown");
        System.out.println("Updated Location: " + ((GPS) bike).getCurrentLocation());

        System.out.println();

        processRide(auto, 8);
        System.out.println("Current Location: " + ((GPS) auto).getCurrentLocation());
        ((GPS) auto).updateLocation("Airport");
        System.out.println("Updated Location: " + ((GPS) auto).getCurrentLocation());
    }
}

