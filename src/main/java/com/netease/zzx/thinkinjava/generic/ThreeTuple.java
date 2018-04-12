package com.netease.zzx.thinkinjava.generic;

/**
 * Created by hzzhangzongxing on 2017/8/5.
 */
public class ThreeTuple<A,B,C> {
    public final A firstFeld;
    public final B secondFeld;
    public final C thirdFeld;

    public ThreeTuple(A firstFeld, B secondFeld, C thirdFeld) {
        this.firstFeld = firstFeld;
        this.secondFeld = secondFeld;
        this.thirdFeld = thirdFeld;
    }

    @Override
    public String toString() {
        return "ThreeTuple{" +
                "firstFeld=" + firstFeld +
                ", secondFeld=" + secondFeld +
                ", thirdFeld=" + thirdFeld +
                '}';
    }
}
