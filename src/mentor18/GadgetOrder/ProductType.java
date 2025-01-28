package mentor18.GadgetOrder;

public enum ProductType {
    LAPTOP(699.99), SMARTPHONE(589.89), TABLET(499.90), HEADPHONES(199.99);

    private final double price;

    ProductType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
