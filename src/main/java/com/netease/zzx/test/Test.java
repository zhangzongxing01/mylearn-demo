package com.netease.zzx.test;

import com.netease.zzx.tools.EduosJacksonUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hzzhangzongxing.
 * on 2017/9/27
 */
public class Test {
    public static void main(String[] args) {
        List<PaperTreeNodeDto> paperTreeNodeDtoList=new ArrayList<>();
        PaperQuestionNodeDto paperTreeNodeDto1=new PaperQuestionNodeDto();
        PaperQuestionDto paperQuestionDto1=new PaperQuestionDto(100L);
        paperTreeNodeDto1.setId(1L);
        paperTreeNodeDto1.setResourceType(0);
        paperTreeNodeDto1.setPaperQuestionDto(paperQuestionDto1);
        paperTreeNodeDtoList.add(paperTreeNodeDto1);
        System.out.println(EduosJacksonUtil.toJsonString(paperTreeNodeDtoList));

        PaperQuestionDtoEx ex=new PaperQuestionDtoEx(100L,"ex");
        PaperQuestionNodeDto paperQuestionNodeDto= (PaperQuestionNodeDto)paperTreeNodeDtoList.get(0);
        paperQuestionNodeDto.setPaperQuestionDto(ex);
        System.out.println(EduosJacksonUtil.toJsonString(paperTreeNodeDtoList));
    }
}
