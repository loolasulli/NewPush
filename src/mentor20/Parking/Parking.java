package mentor20.Parking;

public class Parking {
    private int spaces = 4;

    public synchronized void parking() {
        while(spaces == 0) {
            try {
                System.out.println(Thread.currentThread().getName() + " is waiting for a space..");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        spaces--;
        System.out.println(Thread.currentThread().getName() + " parked a car. Free spaces: " + spaces);
    }

    public synchronized void freeSpaces() {
        spaces = 4;
        System.out.println("New free spaces..");
        notifyAll();
    }
}
