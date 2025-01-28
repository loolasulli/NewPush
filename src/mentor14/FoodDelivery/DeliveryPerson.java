package mentor14.FoodDelivery;

public class DeliveryPerson {
    String name;
    boolean assignedOrders;
    boolean availabilityStatus;

    public DeliveryPerson(String name) {
        this.name = name;
        this.assignedOrders = false;
        this.availabilityStatus = true;
    }


    public void deliveryStatus() {
        System.out.println("Courier's name: " + name + "; Assigned orders: " + assignedOrders +
                "; Availability status: " + availabilityStatus);
    }
}
