package com.netease.zzx.spring.aspect;

/**
 * Created by hzzhangzongxing on 2017/4/24.
 */
public class Test {
    public  void test1(String name,Long id){
        System.out.println(name+id);
    }
    public  void test2(String name,Long id){
        System.out.println(name+id);
    }
    public  void test3(String name,Long id){
        System.out.println(name+id);
    }

    public static void main(String[] args) {
        new Test().test1("aa",111L);
    }
}
