package mentor24.ThreadSafety;

import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Hashtable<String, Integer> threadSafety = new Hashtable<>();

        int numberOfThreads = 4;
        int increments = 1000;

        for (int i = 0; i < numberOfThreads; i++) {
            String threadName = "Thread-" + i;
            Thread thread = new Thread(new ThreadSafeCount(threadSafety, threadName, increments));
            thread.start();
        }

        for (Map.Entry<String, Integer> entry : threadSafety.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
