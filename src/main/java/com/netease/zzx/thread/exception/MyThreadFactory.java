package com.netease.zzx.thread.exception;

import java.util.concurrent.ThreadFactory;

/**
 * Created by hzzhangzongxing on 2017/4/23.
 */
public class MyThreadFactory implements ThreadFactory {
    private final String poolName;
    public MyThreadFactory(String poolName) {
        this.poolName = poolName;
    }
    @Override
    public Thread newThread(Runnable runnable) {
        Thread t= new Thread( poolName);
        t.setUncaughtExceptionHandler(new ExceptionHandler());
        return t;
    }
}
