package mentor14.FoodDelivery;


public class NonVegItem extends MenuItem {

    public NonVegItem(String name, double price) {
        super(name, price, "Non Veg");
    }

    @Override
    public void showItemDetails() {
        System.out.println("Food name: " + name + "; Price: " + price + " $; Veg or Non Veg: " +
                type);
    }
}
