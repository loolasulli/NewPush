package mentor19;

public class Anonymous {
    String name;

    public Anonymous(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 11; i <= 15; i++) {
                    System.out.println(i);
                }
            }
        });
        t2.start();
        System.out.println(Thread.currentThread().getName());
    }
}
