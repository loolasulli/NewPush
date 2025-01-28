package mentor12.Shape;

public class Circle extends Shape {
    String specialFeature;

    public Circle(String name, String specialFeature) {
        super(name);
        this.specialFeature = specialFeature;
    }

    @Override
    public void describeShape() {
        System.out.println("This is a Circle with a special feature: " + specialFeature);
    }
}
