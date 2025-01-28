package mentor12.Shape;

public class Main1 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle("Circle", "It is perfectly round");
        shapes[1] = new Rectangle("Rectangle", "Horizontal");

        for (Shape shapes1: shapes) {
            shapes1.describeShape();
        }
    }
}
