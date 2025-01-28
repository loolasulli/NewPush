package mentor14.FoodDelivery;


public class VegItem extends MenuItem {

    public VegItem(String name, double price) {
        super(name, price, "Veg");
    }

    @Override
    public void showItemDetails() {
        System.out.println("Food name: " + name + "; Price: " + price + " $; Veg or Non Veg: " +
                type);
    }
}


