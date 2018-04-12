package com.netease.zzx.java.thread;

/**
 * Created by hzzhangzongxing.
 * on 2017/9/22
 */
public class MySynchronized {
    public synchronized void  sysout(){
        try {
            System.out.println("准备休眠");
            Thread.sleep(3000);
            System.out.println("休眠结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void  sysoutHello(){
        System.out.println("hello");
    }
}
