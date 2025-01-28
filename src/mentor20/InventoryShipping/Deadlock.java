package mentor20.InventoryShipping;

import java.util.concurrent.locks.ReentrantLock;

public class Deadlock {
    private final ReentrantLock inventory = new ReentrantLock();
    private final ReentrantLock shipping = new ReentrantLock();

    public void processOrder() {
        if (inventory.tryLock()) {
            try {
                if (shipping.tryLock()) {
                    try {
                        System.out.println("Both locks acquired");
                    } finally {
                        shipping.unlock();
                    }
                }
            } finally {
                inventory.unlock();
            }
        }
    }
}
