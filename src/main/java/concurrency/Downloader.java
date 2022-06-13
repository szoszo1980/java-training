package concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Downloader {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(3);

        var tasks = IntStream.range(0,5)
                .mapToObj(i -> new DownloadTask()).toList();

        var results = service.invokeAll(tasks);

        for(var result: results){
            System.out.println(result.get());
        }

        service.shutdown();
    }

}
