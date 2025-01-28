package mentor14.FoodDelivery;

public class CardPayment implements PaymentProcessor {
    int cardNumber;
    int expDate;
    int cvv;

    public CardPayment(int cardNumber, int expDate, int cvv) {
        this.cardNumber = cardNumber;
        this.expDate = expDate;
        this.cvv = cvv;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Card number: " + cardNumber + ", Expiration date: " + expDate +
                ", CVV: " + cvv + "\nAmount: " + amount);
        return true;
    }
}
