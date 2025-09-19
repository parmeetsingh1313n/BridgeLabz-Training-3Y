import java.util.*;

class Doctor {
    String name;

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient p) {
        System.out.println("Doctor " + name + " consulting Patient " + p.name);
    }
}

class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }
}

class Hospital {
    String hospitalName;
    ArrayList<Doctor> doctors;
    ArrayList<Patient> patients;

    Hospital(String name) {
        hospitalName = name;
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }

    void addDoctor(Doctor d) {
        doctors.add(d);
    }

    void addPatient(Patient p) {
        patients.add(p);
    }
}

public class HospitalDemo {
    public static void main(String[] args) {
        Hospital h = new Hospital("City Hospital");

        Doctor d1 = new Doctor("Dr. Sharma");
        Doctor d2 = new Doctor("Dr. Patel");

        Patient p1 = new Patient("Amit");
        Patient p2 = new Patient("Neha");

        h.addDoctor(d1);
        h.addDoctor(d2);
        h.addPatient(p1);
        h.addPatient(p2);

        d1.consult(p1);
        d2.consult(p2);
    }
}
