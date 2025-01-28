package mentor20.Parking;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Parking parking = new Parking();

        Thread car1 = new Thread(parking::parking, "Car 1");
        Thread car2 = new Thread(parking::parking, "Car 2");
        Thread car3 = new Thread(parking::parking, "Car 3");
        Thread car4 = new Thread(parking::parking, "Car 4");
        Thread car5 = new Thread(parking::parking, "Car 5");
        Thread car6 = new Thread(parking::parking, "Car 6");
        Thread car7 = new Thread(parking::parking, "Car 7");

        Thread agent = new Thread(() -> {
            try {
                Thread.sleep(1000);
                parking.freeSpaces();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        agent.start();

        Thread[] threads = new Thread[] {car1, car2, car3, car4, car5, car6, car7};
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
            threads[i].join();
        }

        agent.join();



    }
}
