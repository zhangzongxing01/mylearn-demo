package com.netease.zzx.thinkinjava.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hzzhangzongxing on 2017/8/5.
 */
class Fruit {}
class Apple extends Fruit {}
class Jonathan extends Apple {}
class Orange extends Fruit {}

public class CovariantArrays {
    public static void main(String[] args) {
        Fruit fruit1=new Fruit();
        Apple apple=new Apple();
        Jonathan jonathan=new Jonathan();
        Orange orange=new Orange();


//        Map<? super Apple,String> map= HashMap<Apple,String>();
        List<? super Fruit> list=new ArrayList<>();
        list.add(fruit1);
        list.add(apple);
        list.add(jonathan);
        list.add(orange);
        System.out.println(list);



        Fruit[] fruit = new Apple[10];
        fruit[0] = new Apple(); // OK
        fruit[1] = new Jonathan(); // OK
        // Runtime type is Apple[], not Fruit[] or Orange[]:
        fruit[1] = new Jonathan(); // ArrayStoreException
        try {
            // Compiler allows you to add Fruit:
            fruit[0] = new Fruit(); // ArrayStoreException

        } catch(Exception e) { System.out.println(e); }
        try {
            // Compiler allows you to add Oranges:
            fruit[0] = new Orange(); // ArrayStoreException
        } catch(Exception e) { System.out.println(e); }
    }
}
