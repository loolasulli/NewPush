package mentor13.Vehicle;

public abstract class Car implements Vehicle {
   String fuelType;

    public Car(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public void start() {
        System.out.println("Start..");
    }

    @Override
    public void stop() {
        System.out.println("Stop..");
    }
}
