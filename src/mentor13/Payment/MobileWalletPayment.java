package mentor13.Payment;

public class MobileWalletPayment implements PaymentProcessor {
    private int walletID;
    private int userPhoneNumber;

    public MobileWalletPayment(int walletID, int userPhoneNumber) {
        this.walletID = walletID;
        this.userPhoneNumber = userPhoneNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Amount: " + amount);
    }

    @Override
    public String getPaymentDetails() {
        return "Wallet ID: " + walletID + ", User phone number: " + userPhoneNumber;
    }
}
