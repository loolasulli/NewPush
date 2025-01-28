package mentor13.Payment;

public class Main {
    public static void main(String[] args) {
        CreditCardPayment ccp = new CreditCardPayment(1111, "Lala");
        MobileWalletPayment mwp = new MobileWalletPayment(11, 1111111);
        System.out.println(ccp.getPaymentDetails());
        ccp.processPayment(1.1);
        System.out.println(mwp.getPaymentDetails());
        mwp.processPayment(2.2);
    }
}
