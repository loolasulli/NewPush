package mentor14.Appliance;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Appliance[] appliances = new SmartLight[2];
        appliances[0] = new SmartLight("vacuum", 111);
        appliances[1] = new SmartLight("tv", 112);


        for (Appliance appliance: appliances) {
            appliance.turnOn();
            handleConnectable(appliance);
            appliance.turnOff();
            System.out.println("~  ~  ~  ~");
        }
    }
        private static void handleConnectable(Appliance appliance) {
            if (Objects.nonNull(appliance) && appliance instanceof Connectable connectable) {
                connectable.connectToWifi();
                connectable.disconnectFromWifi();
            }
        }
    }
