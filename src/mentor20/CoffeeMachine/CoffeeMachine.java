package mentor20.CoffeeMachine;

public class CoffeeMachine {
    int cupsAvailable = 5;

    public synchronized void dispenseCoffee() {
        while (cupsAvailable == 0) {
            try {
                System.out.println(Thread.currentThread().getName() + " is waiting for coffee.");
                Thread.sleep(500);
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        cupsAvailable--;
        System.out.println(Thread.currentThread().getName() + " got coffee. Cups left: " + cupsAvailable);
    }

    public synchronized void refillCoffee() {
        cupsAvailable = 5;
        System.out.println("Service agent refilled the coffee machine... ");
        notifyAll();
    }
}
