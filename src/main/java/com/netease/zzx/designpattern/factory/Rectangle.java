package com.netease.zzx.designpattern.factory;

/**
 * @author hzzhangzongxing
 * @version 2018/2/26
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
