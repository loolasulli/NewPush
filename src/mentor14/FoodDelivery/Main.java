package mentor14.FoodDelivery;

public class Main {
    public static void main(String[] args) {
        MenuItem[] items = new MenuItem[2];
        items[0] = new VegItem("Exotic fruits", 150);
        items[1] = new NonVegItem("Seafood", 250);
        MenuService menuService = new Order(111, items);
        Order order = new Order(111, items);
        Customer customer = new Customer("Lala", 11111);
        customer.placeOrders(order);
        Discount discount = new FlatRateDiscount(10);
        double totalAmount = discount.applyDiscount(order.calculateTotalCost());
        System.out.println("Total amount: " + totalAmount);
        PaymentProcessor paymentProcessor = new WalletPayment("Leo bank");
        paymentProcessor.processPayment(totalAmount);
        customer.viewOrderHistory();
    }
}
