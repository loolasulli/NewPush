package mentor13.Vehicle;

public class ElectricCar extends Car {

    public ElectricCar(String fuelType) {
        super(fuelType);
    }

    @Override
    public void start() {
        super.start();
        System.out.println("It's an electric car. ");
    }
}
