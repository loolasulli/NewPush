package mentor12.Vehicle;

public class Vehicle {
    String name;
    int speed;


    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void move() {
        System.out.println(name + " is moving at " + speed + " km/h");
    }
}