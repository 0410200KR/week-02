package vehicleSystem;

class Bike extends Vehicle {
    private double helmetCharge;

    public Bike(String vehicleNumber, String type, double rentalRate, double helmetCharge) {
        super(vehicleNumber, type, rentalRate);
        this.helmetCharge = helmetCharge;
    }

    @Override
    public double calculateRentalCost(int days) {
        return (getRentalRate() * days) + helmetCharge;
    }
}
