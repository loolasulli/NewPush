package mentor14.FoodDelivery;

public class WalletPayment implements PaymentProcessor {
    String bankAccount;

    public WalletPayment(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Bank account: " + bankAccount);
        return true;
    }
}
