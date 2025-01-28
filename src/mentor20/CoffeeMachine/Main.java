package mentor20.CoffeeMachine;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CoffeeMachine machine = new CoffeeMachine();

        Thread thread1 = new Thread(machine::dispenseCoffee, "User 1");
        Thread thread2 = new Thread(machine::dispenseCoffee, "User 2");
        Thread thread3 = new Thread(machine::dispenseCoffee, "User 3");
        Thread thread4 = new Thread(machine::dispenseCoffee, "User 4");
        Thread thread5 = new Thread(machine::dispenseCoffee, "User 5");
        Thread thread6 = new Thread(machine::dispenseCoffee, "User 6");

        Thread agent = new Thread(() -> {
            try {
                Thread.sleep(1000);
                machine.refillCoffee();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        agent.start();

        Thread[] threads = new Thread[] {thread1, thread2, thread3, thread4, thread5, thread6};
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
            threads[i].join();
        }

        agent.join();
    }
}
