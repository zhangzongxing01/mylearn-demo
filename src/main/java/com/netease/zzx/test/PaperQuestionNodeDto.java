package com.netease.zzx.test;

/**
 * Created by hzzhangzongxing.
 * on 2017/9/27
 */
public class PaperQuestionNodeDto extends PaperTreeNodeDto {
    private PaperQuestionDto paperQuestionDto;

    public PaperQuestionDto getData() {
        return paperQuestionDto;
    }

    public void setPaperQuestionDto(PaperQuestionDto paperQuestionDto) {
        this.paperQuestionDto = paperQuestionDto;
    }
    public void setData(PaperQuestionDto paperQuestionDto) {
        this.paperQuestionDto = paperQuestionDto;
    }
}
