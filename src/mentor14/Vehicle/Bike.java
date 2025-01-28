package mentor14.Vehicle;

public class Bike extends Vehicle implements Driveable {
    @Override
    public void startDriving() {
        System.out.println("Bike started driving.");
    }

    @Override
    public void stopDriving() {
        System.out.println("Bike stopped driving.");
    }
}
