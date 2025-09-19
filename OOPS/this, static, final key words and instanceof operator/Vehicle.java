class Vehicle {
    static double registrationFee = 5000; // same for all..

    private final String registrationNumber; // fixed id
    private String ownerName;
    private String vehicleType;

    Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicle() {
        if (this instanceof Vehicle) {
            System.out.println("Reg No: " + registrationNumber + ", Owner: " + ownerName + ", Type: " + vehicleType + ", Fee: " + registrationFee);
        }
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Updated Registration Fee: " + registrationFee);
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("UP80HD1313", "Karan", "Car");
        v1.displayVehicle();
        Vehicle.updateRegistrationFee(6000);
    }
}
