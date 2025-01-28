package mentor20.InventoryShipping;

public class Main {
    public static void main(String[] args) {
        Deadlock deadlock = new Deadlock();
        Thread thread = new Thread(deadlock::processOrder);
        thread.start();
    }
}
