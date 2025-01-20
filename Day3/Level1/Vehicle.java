public class Vehicle {
    static int registrationFee=1200;
    String ownerName;
    String vehicleType;
    final int  registrationNumber;
    public Vehicle(String ownerName,String vehicleType,int registrationNumber){
        this.registrationNumber=registrationNumber;
        this.vehicleType=vehicleType;
        this.ownerName=ownerName;


    }
    public void display(){
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: $" + registrationFee);
    }
    public static void updateRegistrationFee(int newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: " + registrationFee);

    }
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("John Doe", "Car", 1001);
        Vehicle vehicle2 = new Vehicle("Jane Smith", "Motorcycle", 1002);
        if (vehicle1 instanceof Vehicle ) { 
            System.out.println("Vehicle details are valid.");
        }
        
        vehicle1.display();
        Vehicle.updateRegistrationFee(700);
        if (vehicle2 instanceof Vehicle ) { 
            System.out.println("Vehical details are valid.");
        }

        vehicle2.display();
        Vehicle.updateRegistrationFee(600);

    }


}
