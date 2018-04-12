package com.netease.k12;

import java.io.*;
import java.util.*;

/**
 * @author hzzhangzongxing
 * date 2018/2/2
 */
public class FileTest {

    public static void main(String[] args) throws IOException {
        generateMemberWithGrade();
    }
    private static void generateMemberWithGrade()throws IOException {
        File file1 = new File("D:\\test\\member1.txt");
        File file2 = new File("D:\\test\\member2.txt");

        List<Long>memberId1s=getMemberIds(file1);
        List<Long>memberId2s=getMemberIds(file2);
        System.out.println(memberId1s.size());
        System.out.println(memberId2s.size());
        Set<Long>memberId1Set=new HashSet<>(memberId1s);
        Set<Long>memberId2Set=new HashSet<>(memberId2s);
        for(Long mem:memberId1Set){
            if(memberId2Set.contains(mem)){
                System.out.println(mem);
            }
        }

    }

    private static List<Long> getMemberIds(File file) throws IOException {
        InputStreamReader read = new InputStreamReader(new FileInputStream(file), "UTF-8");//考虑到编码格式
        BufferedReader bufferedReader = new BufferedReader(read);
        String lineTxt ;
        List<Long>memberIds=new ArrayList<>();
        while ((lineTxt = bufferedReader.readLine()) != null) {
            memberIds.add(Long.valueOf(lineTxt.trim()));
        }
        read.close();
        return memberIds;
    }
}
