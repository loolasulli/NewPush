package mentor20.WaterDispenser;

public class WaterDispenser {
    int waterCapacity = 20;

    public synchronized void dispenseWater(int liters) {
        if (liters <= waterCapacity) {
            System.out.println(liters + " liters are available for water capacity..");
            this.waterCapacity -= liters;
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " log successful!");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Not enough capacity..." + Thread.currentThread().getName() +
                    " failed water filling attempts.");
        }
    }

    public int getRemainingWater() {
        return waterCapacity;
    }
}
