package com.netease.zzx.refactoring.chapter8.node7;

/**
 * Created by hzzhangzongxing on 2017/5/22.
 */
public class Test {
    public static void main(String[] args) {
        Customer customer=new Customer("zzx");
        Order order1=new Order(1000L);
        order1.setCustomer(customer);
        Order order2=new Order(1002L);
        order2.setCustomer(customer);
        System.out.println(customer);
    }
}
