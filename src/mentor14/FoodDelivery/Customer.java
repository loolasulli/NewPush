package mentor14.FoodDelivery;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    String name;
    int contactDetails;
    List<Order> orderHistory;

    public Customer(String name, int contactDetails) {
        this.name = name;
        this.contactDetails = contactDetails;
        this.orderHistory = new ArrayList<>();
    }

    public void placeOrders(Order order) {
        orderHistory.add(order);
        }


    public void viewOrderHistory() {
        for (Order order : orderHistory) {
            System.out.println(order.manageOrderStatus());
        }
    }
}