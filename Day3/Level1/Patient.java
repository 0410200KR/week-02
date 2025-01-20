public class Patient {
     String name;
    int age;
    String ailment;
   final int patientID; 
    static String hospitalName = "City Hospital"; 
     static int totalPatients = 0;
     public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }
    public void display(){
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println("Hospital Name: " + hospitalName);
    }
    public static void getTotalPatients() {
        System.out.println("Total patients admitted in " + hospitalName + ": " + totalPatients);
    }
    public static void main(String[] args) {
        Patient patient1 = new Patient("Ali", 30, "Fever", 101);
        Patient patient2 = new Patient("Bat", 45, "Diabetes", 102);
        if (patient1 instanceof Patient ) { 
            System.out.println("Patient details are valid.");
        }

        patient1.display();
        if (patient2 instanceof Patient ) { 
            System.out.println("Patient details are valid.");
        }

        patient2.display();
        // Display total patients
        Patient.getTotalPatients(); 
    }
}
