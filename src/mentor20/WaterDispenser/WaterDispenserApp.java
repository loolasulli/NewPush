package mentor20.WaterDispenser;

public class WaterDispenserApp {
    public static void main(String[] args) throws InterruptedException {
        WaterDispenser dispenser = new WaterDispenser();
        Thread thread1 = new Thread(() -> dispenser.dispenseWater(10));
        Thread thread2 = new Thread(() -> dispenser.dispenseWater(1));
        Thread thread3 = new Thread(() -> dispenser.dispenseWater(22));
        Thread thread4 = new Thread(() -> dispenser.dispenseWater(8));
        Thread thread5 = new Thread(() -> dispenser.dispenseWater(10));

        Thread[] threads = new Thread[] {thread1, thread2, thread3, thread4, thread5};
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
            threads[i].join();
            System.out.println("Final water level: " + dispenser.getRemainingWater());
        }
    }
}
