package mentor14.FoodDelivery;

abstract public class MenuItem {
    String name;
    double price;
    String type;

    public MenuItem(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    abstract public void showItemDetails();
}



