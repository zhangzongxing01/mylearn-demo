package com.netease.zzx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     for(int i=1;i<=7;i++){
         for(int j=i+1;j<=7;j++){
             for(int k =j+1;k<=7;k++){
                 for(int p =k+1;p<=7;p++){
                         if(i+j+k+p==17){
                             System.out.println(i+" "+j+" "+k+" "+p);
                         }
                 }
             }
         }

     }
    }
    public static void test1(){
        List<String> list=new ArrayList<String>();
    }
}
