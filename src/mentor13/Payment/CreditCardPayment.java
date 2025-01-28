package mentor13.Payment;

public class CreditCardPayment implements PaymentProcessor {
    private int cardNumber;
    private String cardHolderName;

    public CreditCardPayment(int cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Amount: " + amount);
    }

    @Override
    public String getPaymentDetails() {
        return "Card number: " + cardNumber + ", Card holder name: " + cardHolderName;
    }
}
