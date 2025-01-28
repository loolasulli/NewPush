package mentor24.ThreadSafety;


import java.util.Hashtable;

public class ThreadSafeCount implements Runnable {
    Hashtable<String, Integer> counters;
    String threadName;
    int increments;

    public ThreadSafeCount(Hashtable<String, Integer> counters, String threadName, int increments) {
        this.counters = counters;
        this.threadName = threadName;
        this.increments = increments;
    }

    @Override
    public void run() {
        for (int i = 0; i < increments; i++) {
            synchronized (counters) {
                counters.put(threadName, counters.getOrDefault(threadName, 0) + 1);
            }
        }
    }
}
