package com.netease.zzx.designpattern.factory;

/**
 * @author hzzhangzongxing
 * @version 2018/2/26
 */
public class FactoryTest {
    public static void main(String[] args) {
        ShapeFactory.createShape(Rectangle.class).draw();
    }

}
