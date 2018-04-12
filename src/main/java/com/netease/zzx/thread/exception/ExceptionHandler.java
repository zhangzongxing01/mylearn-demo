package com.netease.zzx.thread.exception;

/**
 * Created by hzzhangzongxing on 2017/4/23.
 */
public class ExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println(t.getName() +("  出现严重错误！！！授权后台线程异常退出！"+e.toString()));
//        System.exit(0);
    }
}
