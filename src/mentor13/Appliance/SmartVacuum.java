package mentor13.Appliance;

public class SmartVacuum extends Appliance implements Cleanable, Connectable {

    public SmartVacuum(String name, int ID) {
        super(name, ID);
    }

    @Override
    public void startCleaning() {
        System.out.println("Vacuum start cleaning..");
    }

    @Override
    public void stopCleaning() {
        System.out.println("Stop cleaning..");
    }

    @Override
    public void connectToWifi() {
        System.out.println("Connect to wifi..");
    }

    @Override
    public void disconnectFromWifi() {
        System.out.println("Disconnect from wifi..");
    }


}
