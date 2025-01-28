package mentor12.Vehicle;

public class Main2 {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car("Car", 120, "Petrol");
        vehicles[1] = new Bicycle("Bicycle", 25, 18);

        for (Vehicle vehicle: vehicles) {
            vehicle.move();
        }
    }
}
