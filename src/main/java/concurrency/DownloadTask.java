package concurrency;

import java.util.concurrent.Callable;

public class DownloadTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " start download");
        Thread.sleep((int) (Math.random() * 1000));
        System.out.println(Thread.currentThread().getName() + "Download has ended");
        return 200;
    }
}
