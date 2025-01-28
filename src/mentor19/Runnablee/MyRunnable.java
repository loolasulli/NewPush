package mentor19.Runnablee;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 6; i <=10; i++) {
            System.out.println(i);
        }
    }
}
