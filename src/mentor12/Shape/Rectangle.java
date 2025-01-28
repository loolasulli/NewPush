package mentor12.Shape;

public class Rectangle extends Shape {
    String orientation;

    public Rectangle(String name, String orientation) {
        super(name);
        this.orientation = orientation;
    }

    @Override
    public void describeShape() {
        System.out.println("This is a Rectangle with an orientation: " + orientation);
    }
}
