package com.netease.zzx.refactoring.chapter8.node7;

/**
 * Created by hzzhangzongxing on 2017/5/22.
 *
 * 控制者
 */
public class Order {
    private Long orderId;
    private Customer customer;

    public Order(Long orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
        customer.firendOrders().add(this);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                '}';
    }
}
