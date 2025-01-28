package mentor14.Vehicle;

abstract public class Vehicle {
    String id;
    String name;

    String showDetails() {
        return "ID: " + id + ", Name: " + name;
    }
}
