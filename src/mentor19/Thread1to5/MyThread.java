package mentor19.Thread1to5;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
