package com.netease.zzx.java8.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hzzhangzongxing on 2017/5/23.
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String ,String> map=new HashMap<String, String>();
        map.put("qqq","qqq");
        map.put("www","www");
        map.put("eee","eee");
        map.put("rrr","rrr");
        map.put("ttt","ttt");
        map.forEach((k,v)->System.out.println("k:"+k+" value: "+ v));
    }
}
