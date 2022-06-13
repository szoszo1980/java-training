package concurrency;

import java.util.concurrent.*;
import java.util.function.Function;
import java.util.function.Supplier;

public class CompletableDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Supplier<String> task = () ->
        {
            System.out.println("Task");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            return "hello";
        };

        Function<String,String> task2 = (s) ->
        {
            System.out.println("task2");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            return s.toUpperCase();
        };

        var service = Executors.newFixedThreadPool(1);

        var result = CompletableFuture.supplyAsync(task)
                        .thenApply(task2);

        System.out.println(result.get());
        System.out.println("End");
    }
}
