package mentor9;

public class Rectangle {
    String color;
    double width;
    double length;

    public Rectangle(String color, double width, double length) {
        this.color = color;
        this.width = width;
        this.length = length;
    }

    public double calculateArea() {
        return width * length;
    }


    void printShape() {
        if (width == length) {
            System.out.println(color + " square is " + calculateArea() + " sq.metres.");
        } else {
            System.out.println(color + " rectangle is " + calculateArea() + " sq.metres.");
        }

    }
}


