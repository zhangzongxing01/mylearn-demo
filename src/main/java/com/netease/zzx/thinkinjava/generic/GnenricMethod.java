package com.netease.zzx.thinkinjava.generic;

/**
 * Created by hzzhangzongxing on 2017/8/5.
 */
public class GnenricMethod<P,W,E> {
    public <T> void getTClass(T t,Object tt) throws IllegalAccessException, InstantiationException {
        System.out.println(t.getClass().isInstance(tt));
        System.out.println(t.getClass().getName());
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        GnenricMethod myclass=new GnenricMethod();
        myclass.getTClass(12,Integer.class);
    }
}
