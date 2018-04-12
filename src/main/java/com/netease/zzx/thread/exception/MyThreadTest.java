package com.netease.zzx.thread.exception;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import javax.management.timer.Timer;
import java.util.concurrent.*;

/**
 * Created by hzzhangzongxing on 2017/4/23.
 */
public class MyThreadTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool(new MyThreadFactory("cc"));
        executorService.execute(new MyThread());
        Future future= executorService.submit(new MyThread());
        System.out.println(future.isDone());
        TimeUnit.SECONDS.sleep(2);

//        System.out.println("ddd"+future.get());

        executorService.shutdownNow();


//        new MyThread("ss").start();
    }

}
