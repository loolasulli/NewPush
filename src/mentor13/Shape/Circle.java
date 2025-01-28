package mentor13.Shape;

public class Circle extends Shape implements Resizable {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        System.out.println(Math.PI * Math.pow(5,2));
    }

    @Override
    public void resize(double factor) {

    }

    @Override
    public void reset() {

    }
}
