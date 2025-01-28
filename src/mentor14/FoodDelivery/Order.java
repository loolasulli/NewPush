package mentor14.FoodDelivery;

import java.util.List;

public class Order implements MenuService {
    int orderId;
    MenuItem[] items;
    String customerInformation;

    public Order(int orderId, MenuItem[] items) {
        this.orderId = orderId;
        this.items = new MenuItem[2];
        this.customerInformation = customerInformation;
    }


    double calculateTotalCost() {
        double total = 0;
        for (MenuItem item: items) {
            total += item.price;
        }
        return total;
    }

    public String manageOrderStatus() {
        return "Order ID: " + orderId + "; Customer information: " + customerInformation +
                "; Total cost: " + calculateTotalCost();
    }

    @Override
    public List<MenuItem> getMenuItems() {
        return List.of();
    }
}
