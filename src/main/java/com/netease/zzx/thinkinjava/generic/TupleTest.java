package com.netease.zzx.thinkinjava.generic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by hzzhangzongxing on 2017/8/5.
 */
public class TupleTest {
    public static void main(String[] args) {
        String s="jjj";
        Integer i=12;
        List<Long> list= Arrays.asList(233L,433L);
        ThreeTuple<String,Integer,List<Long>> threeTuple=new ThreeTuple<>(s,i,list);
        System.out.println(threeTuple);
        Collections.<String>emptyList();
    }

}
