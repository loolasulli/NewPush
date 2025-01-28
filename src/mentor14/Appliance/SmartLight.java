package mentor14.Appliance;

public class SmartLight extends Appliance implements Connectable {

    public SmartLight(String name, int ID) {
        super(name, ID);
    }

    @Override
    public void turnOn() {
        System.out.println("Turn on appliance: " + name + ", ID: " + ID);
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off appliance: " + name + ", ID: " + ID);
    }

    @Override
    public void connectToWifi() {
        System.out.println("Connect to wifi.");
    }

    @Override
    public void disconnectFromWifi() {
        System.out.println("Disconnect from wifi. ");
    }
}