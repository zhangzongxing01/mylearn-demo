package com.netease.zzx.thinkinjava.generic;

import java.util.*;

/**
 * Created by hzzhangzongxing on 2017/8/5.
 */
public class LostInfomation {
    public static void main(String[] args) {
        List<Frob> list=new ArrayList<>();
        Map<Frob,Fnorkle>map=new HashMap<>();
        Quark<Fnorkle>quark=new Quark<>();
        Particle <Long,Double>particle=new Particle<>();
        System.out.println(Arrays.asList(list.getClass().getTypeParameters()));
        System.out.println(Arrays.asList(map.getClass().getTypeParameters()));
        System.out.println(Arrays.asList(quark.getClass().getTypeParameters()));
        System.out.println(Arrays.asList(particle.getClass().getTypeParameters()));
    }
}
class Frob{}
class Fnorkle{}
class Quark<Q>{}
class Particle<P,M>{}

