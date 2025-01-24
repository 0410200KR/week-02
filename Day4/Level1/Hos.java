import java.util.ArrayList;
import java.util.List;

class Patient {
    private String name;
    private int age;
    private List<Doctor> doctors;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
            doctor.addPatient(this); // Ensure bidirectional relationship
        }
    }

    public void listDoctors() {
        System.out.println(name + "'s doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("- Dr. " + doctor.getName() + ", " + doctor.getSpecialty());
        }
    }
}

class Doctor {
    private String name;
    private String specialty;
    private List<Patient> patients;

    public Doctor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this); // Ensure bidirectional relationship
        }
    }

    public void consult(Patient patient) {
        if (patients.contains(patient)) {
            System.out.println("Dr. " + name + " is consulting with " + patient.getName() + " (age " + patient.getAge() + ").");
        } else {
            System.out.println("Dr. " + name + " has no relationship with " + patient.getName() + ". Add the patient first.");
        }
    }

    public void listPatients() {
        System.out.println("Dr. " + name + "'s patients:");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getName() + ", age " + patient.getAge());
        }
    }
}

class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
    }

    public void listDoctors() {
        System.out.println("Doctors in " + name + ":");
        for (Doctor doctor : doctors) {
            System.out.println("- Dr. " + doctor.getName() + ", " + doctor.getSpecialty());
        }
    }

    public void listPatients() {
        System.out.println("Patients in " + name + ":");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getName() + ", age " + patient.getAge());
        }
    }
}

public class Hos {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City General Hospital");

        // Create doctors
        Doctor doctor1 = new Doctor("Smith", "Cardiology");
        Doctor doctor2 = new Doctor("Johnson", "Neurology");

        // Create patients
        Patient patient1 = new Patient("Aman", 30);
        Patient patient2 = new Patient("Ayan", 40);

        // Add doctors and patients to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Establish relationships
        doctor1.addPatient(patient1);
        doctor2.addPatient(patient1);
        doctor2.addPatient(patient2);

        // Display relationships
        hospital.listDoctors();
        hospital.listPatients();

        doctor1.listPatients();
        doctor2.listPatients();

        patient1.listDoctors();
        patient2.listDoctors();

        // Consultations
        doctor1.consult(patient1);
        doctor2.consult(patient2);
        doctor1.consult(patient2); // No relationship, should prompt to add the patient first
    }
} 
    

