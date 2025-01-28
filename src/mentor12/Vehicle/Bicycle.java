package mentor12.Vehicle;

public class Bicycle extends Vehicle {
    int gearCount;

    public Bicycle(String name, int speed, int gearCount) {
        super(name, speed);
        this.gearCount = gearCount;
    }

    @Override
    public void move() {
        super.move();
        System.out.print(" with " + gearCount + " gears.");
    }
}