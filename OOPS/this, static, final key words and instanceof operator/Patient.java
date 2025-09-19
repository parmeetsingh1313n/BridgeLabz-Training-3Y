class Patient {
    static String hospitalName = "Apollo Hospital";
    static int totalPatients = 0;

    private final int patientID;
    private String name;
    private int age;
    private String ailment;

    Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    void displayPatient() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName + ", ID: " + patientID + ", Name: " + name + ", Age: " + age + ", Ailment: " + ailment);
        }
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    public static void main(String[] args) {
        Patient p1 = new Patient(201, "Rohit", 30, "Fever");
        Patient p2 = new Patient(202, "Jagnoor", 25, "Injury");
        p1.displayPatient();
        p2.displayPatient();
        Patient.getTotalPatients();
    }
}
