package com.netease.zzx.thread.exception;

import java.util.List;

/**
 * Created by hzzhangzongxing on 2017/4/23.
 */
public class MyThread extends Thread  {
    @Override
    public void run() {
        List list=null;
        System.out.println(list.size());
    }

}
