package hospitalManagement;

public class Main {
    public static void processPatient(Patient patient) {
        patient.getPatientDetails();
        System.out.println("Total Bill: " + patient.calculateBill());
    }

    public static void main(String[] args) {
        Patient inPatient = new InPatient("P001", "John Doe", 45, 2000, 5);
        Patient outPatient = new OutPatient("P002", "Jane Smith", 30, 500);

        // Process InPatient
        processPatient(inPatient);
        if (inPatient instanceof MedicalRecord) {
            MedicalRecord record = (MedicalRecord) inPatient;
            record.addRecord("Admitted for surgery.");
            record.addRecord("Prescribed painkillers.");
            record.viewRecords();
        }

        System.out.println();

    }
}
