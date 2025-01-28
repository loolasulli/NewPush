package mentor12.Vehicle;

public class Car extends Vehicle {
    String fuelType;

    public Car(String name, int speed, String fuelType) {
        super(name, speed);
        this.fuelType = fuelType;
    }

    @Override
    public void move() {
        super.move();
        System.out.println(" using " + fuelType + " fuel.");
    }
}