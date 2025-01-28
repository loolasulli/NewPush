package mentor13.Shape;

public class Rectangle extends Shape implements Resizable {
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void area() {
        System.out.println(length * width);
    }

    @Override
    public void resize(double factor) {

    }

    @Override
    public void reset() {

    }
}
