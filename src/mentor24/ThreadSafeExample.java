package mentor24;

import java.util.Hashtable;

public class ThreadSafeExample extends Thread{
    Hashtable<String, Integer> table;

    public ThreadSafeExample(Hashtable<String, Integer> table) {
        this.table = table;
    }

    @Override
    public void run() {
        table.put("marakuya", 3);
        System.out.println(Thread.currentThread().getName() + " : " + table.get("marakuya"));
    }

    public static void main(String[] args) {
        Hashtable<String, Integer> table = new Hashtable<>();
        Thread thread1 = new ThreadSafeExample(table);
        Thread thread2 = new ThreadSafeExample(table);

        thread1.start();
        thread2.start();
    }
    }