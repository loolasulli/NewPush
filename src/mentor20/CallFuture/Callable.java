package mentor20.CallFuture;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Callable {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newSingleThreadExecutor();

        java.util.concurrent.Callable<String> task = () -> {
            Thread.sleep(500);
            return "The document processing is complete. ";
        };


        Future<String> future = service.submit(task);
        System.out.println("Result: " + future.get());
        service.shutdown();
    }
}
