package com.netease.zzx.test;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author hzzhangzongxing
 * @date 2017/12/14
 */
public class MyFileTest {
    public static void main(String[] args) throws IOException {
//        generateMemberWithGrade("1001582028");
//        generateMemberWithGrade("1001582027");
//        generateMemberWithGrade("1001581043");
//        generateMemberWithGrade("1001582026");
        generateSql();

    }
    private static void generateMemberWithGrade(String couponId)throws IOException{
        Map<String, String>map=getMemberGradeMap();
        File file = new File("D:\\test\\promote\\"+couponId+".txt");
        File outFile = new File("D:\\test\\promote\\"+couponId+"-grade.txt");
        if (file.isFile() && file.exists()) { //判断文件是否存在
            InputStreamReader read = new InputStreamReader(new FileInputStream(file), "UTF-8");//考虑到编码格式
            BufferedWriter out = new BufferedWriter(new FileWriter(outFile));
            BufferedReader bufferedReader = new BufferedReader(read);
            String lineTxt ;
            while ((lineTxt = bufferedReader.readLine()) != null) {
                String [] strings=lineTxt.split(" ");
                String grade = map.get(strings[1]);
                String line=lineTxt;
                if(grade!=null){
                    line+="  grade= ";
                    line+=grade;
                }
                System.out.println(strings[1]);
                out.write(line);
                out.write("\r\n");
                System.out.println(strings.length);
            }
            out.close();
            read.close();
        }
    }
    public static Map<String,String>getMemberGradeMap()throws IOException{
        File file = new File("D:\\test\\grade.txt");
        Map<String, String>map=new HashMap<>();
        if (file.isFile() && file.exists()) { //判断文件是否存在
            InputStreamReader read = new InputStreamReader(new FileInputStream(file), "UTF-8");//考虑到编码格式
            BufferedReader bufferedReader = new BufferedReader(read);
            String lineTxt ;
            while ((lineTxt = bufferedReader.readLine()) != null) {
                String [] strings=lineTxt.split("\t");
                map.put(strings[0].trim(),strings[1].trim());
            }
            read.close();
        }
        return map;
    }

    public static void generateSql()throws IOException{
        List<String> memberIds = new ArrayList<>();
        File file = new File("D:\\test\\memberId.txt");
        if (file.isFile() && file.exists()) { //判断文件是否存在
            InputStreamReader read = new InputStreamReader(new FileInputStream(file), "UTF-8");//考虑到编码格式
            BufferedReader bufferedReader = new BufferedReader(read);
            String lineTxt = null;
            while ((lineTxt = bufferedReader.readLine()) != null) {
                memberIds.add(lineTxt.trim());
            }
            read.close();
        }
        System.out.println(memberIds.size());
        StringBuilder sb=new StringBuilder("select id ,real_name,phone_number from member where id in (");
        for(int i=0;i<memberIds.size();i++){
            sb.append(memberIds.get(i));
            if(i+1!=memberIds.size()){
                sb.append(" , ");
            }
        }
        sb.append(" );");
        System.out.println(sb);
    }
}

