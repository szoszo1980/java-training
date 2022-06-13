package concurrency;

import java.util.concurrent.*;

public class WaitDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        Callable<String> task = () ->
        {
            Thread.sleep(1000);
            return "hello";
        };

        var service = Executors.newFixedThreadPool(1);
        var result = service.submit(task);

        try {
            System.out.println("get result");
            System.out.println(result.get(5, TimeUnit.SECONDS));
            System.out.println("got result");
        }finally
        {
            service.shutdown();
        }
    }
}
