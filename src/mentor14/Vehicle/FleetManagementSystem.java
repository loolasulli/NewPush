package mentor14.Vehicle;

import java.util.Objects;

public class FleetManagementSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car(),
                new Bike(),
                new ElectricScooter()
        };


        for (Vehicle vehicle: vehicles) {
            handleDriveable(vehicle);
            handleFuelable(vehicle);
        }
    }


    private static void handleFuelable(Vehicle vehicle) {
        if (Objects.nonNull(vehicle) && vehicle instanceof Fuelable fuelable) {
            fuelable.refuel();
            fuelable.stopRefueling();
        }
    }


    private static void handleDriveable(Vehicle vehicle) {
        if (Objects.nonNull(vehicle) && vehicle instanceof Driveable driveable) {
            driveable.startDriving();
            driveable.stopDriving();
        }
    }
}