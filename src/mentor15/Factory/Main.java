package mentor15.Factory;

public class Main {
    public static void main(String[] args) {

        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle vehicle = vehicleFactory.createVehicle("car");
        vehicle.drive();

        Vehicle vehicle1 = vehicleFactory.createVehicle("bike");
        vehicle1.drive();

    }
}
