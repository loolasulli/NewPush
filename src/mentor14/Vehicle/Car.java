package mentor14.Vehicle;

public class Car extends Vehicle implements Fuelable, Driveable{

    @Override
    public void startDriving() {
        System.out.println("Car started driving.");
    }

    @Override
    public void stopDriving() {
        System.out.println("Car stopped driving.");
    }

    @Override
    public void refuel() {
        System.out.println("Car is refueling.");
    }

    @Override
    public void stopRefueling() {
        System.out.println("Car stopped refueling.");
    }
}
