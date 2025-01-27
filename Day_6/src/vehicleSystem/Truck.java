package vehicleSystem;

class Truck extends Vehicle implements Insurable {
    private static final double INSURANCE_RATE = 0.1; // 10% of rental cost
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return calculateRentalCost(1) * INSURANCE_RATE;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy: " + insurancePolicyNumber;
    }
}
