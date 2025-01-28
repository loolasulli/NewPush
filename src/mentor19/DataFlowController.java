package mentor19;

public class DataFlowController {
    public static void main(String[] args) throws InterruptedException {
        DataLoader loader = new DataLoader();
        CacheUpdater updater = new CacheUpdater();
        LogWriter writer = new LogWriter();
        Thread[] threads = new Thread[] {loader, updater, writer};

        updater.setDaemon(true);

        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
            threads[i].join();
        }

        System.out.println("Main threads: Generating the final report.");
    }

    static class DataLoader extends Thread {
        @Override
        public void run() {
            try {
                System.out.println("Thread 1: Loading critical data..");
                Thread.sleep(4000);
                System.out.println("Thread 1: Loaded critical data.");
            } catch (InterruptedException e) {
                System.out.println("Thread 1 was interrupted.");
            }
        }
    }

    static class CacheUpdater extends Thread {
        @Override
        public void run() {
            System.out.println("Thread 2: Updates cache data..");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread 2: Updated cache data.");
        }
    }

    static class LogWriter extends Thread {
        @Override
        public void run() {
            try {
                System.out.println("Thread 3: Writes logs..");
                Thread.sleep(1000);
                System.out.println("Thread 3: Wrote logs.");
            } catch (InterruptedException e) {
                System.out.println("Thread 3 was interrupted.");
            }
        }
    }
}
