package mentor19.Thread1to5;

public class Main {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
        t.start();
    }
}
