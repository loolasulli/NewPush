package mentor19.Daemon;

public class Daemon extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Daemon thread is running...");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Finished..");
    }
//
//    Thread daemon = new Thread(() -> {
//        while (true) {
//            try {
//                Thread.sleep(1000);
//                System.out.println("Daemon thread is running...");
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    });
}