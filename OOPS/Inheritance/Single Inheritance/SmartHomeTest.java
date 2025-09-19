// Superclass Device
class Device {
    int deviceId;
    String status;

    Device(int deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId + " | Status: " + status);
    }
}

// Subclass Thermostat
class Thermostat extends Device {
    int tempSetting;

    Thermostat(int deviceId, String status, int tempSetting) {
        super(deviceId, status);
        this.tempSetting = tempSetting;
    }

    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature set to: " + tempSetting + "°C");
    }
}

public class SmartHomeTest {
    public static void main(String[] args) {
        Thermostat t1 = new Thermostat(101, "ON", 24);
        t1.displayStatus();
    }
}