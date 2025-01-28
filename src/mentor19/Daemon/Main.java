package mentor19.Daemon;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Daemon d = new Daemon();
        //d.setDaemon(true);
        d.start();
        d.join();
    }
}
