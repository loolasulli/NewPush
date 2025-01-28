package mentor14.FoodDelivery;

public class CashPayment implements PaymentProcessor {

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Cash payment: " + amount);
        return true;
    }
}
