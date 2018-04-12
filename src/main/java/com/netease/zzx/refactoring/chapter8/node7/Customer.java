package com.netease.zzx.refactoring.chapter8.node7;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by hzzhangzongxing on 2017/5/22.
 *
 * 被控制者
 */
public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    private Set<Order>orderSet=new HashSet<Order>();
    Set<Order> firendOrders(){
        return this.orderSet;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", orderSet=" + orderSet +
                '}';
    }
}
