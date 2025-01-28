package mentor14.Vehicle;

public class ElectricScooter extends Vehicle implements Driveable {
    @Override
    public void startDriving() {
        System.out.println("ElectricScooter started driving.");
    }

    @Override
    public void stopDriving() {
        System.out.println("ElectricScooter stopped driving.");
    }
}
