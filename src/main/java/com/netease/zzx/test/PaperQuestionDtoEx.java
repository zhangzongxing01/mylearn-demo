package com.netease.zzx.test;

/**
 * Created by hzzhangzongxing.
 * on 2017/9/27
 */
public class PaperQuestionDtoEx extends PaperQuestionDto {
    private String ex;

    public PaperQuestionDtoEx(Long questionId, String ex) {
        super(questionId);
        this.ex = ex;
    }

    public String getEx() {
        return ex;
    }

    public void setEx(String ex) {
        this.ex = ex;
    }
}
