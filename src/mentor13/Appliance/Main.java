package mentor13.Appliance;

public class Main {
    public static void main(String[] args) {
        SmartVacuum smartVacuum = new SmartVacuum("vacuum", 111);
        smartVacuum.showDetails();
        smartVacuum.startCleaning();
        smartVacuum.stopCleaning();
        smartVacuum.connectToWifi();
        smartVacuum.disconnectFromWifi();
    }
}
