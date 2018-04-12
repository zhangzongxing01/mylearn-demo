package com.netease.zzx.designpattern.factory;

/**
 * @author hzzhangzongxing
 * @version 2018/2/26
 */
public class ShapeFactory {
    public static <T> T createShape(Class<? extends T> shape)  {

        try {
            return  (T) Class.forName(shape.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
