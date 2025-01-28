package mentor19;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OrderDataFetcher orderDataFetcher = new OrderDataFetcher();
        PaymentDataFetcher paymentDataFetcher = new PaymentDataFetcher();

        orderDataFetcher.start();
        paymentDataFetcher.start();

        orderDataFetcher.join();
        paymentDataFetcher.join();

        System.out.println("Main thread: Generating the final report.");
    }

    static class OrderDataFetcher extends Thread {
        @Override
        public void run() {
            try {
                System.out.println("Fetching order data..");
                Thread.sleep(2000);
                System.out.println("Order data fetched.");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static class PaymentDataFetcher extends Thread {
        @Override
        public void run() {
            try {
                System.out.println("Fetching payment data..");
                Thread.sleep(3000);
                System.out.println("Payment data fetched.");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

