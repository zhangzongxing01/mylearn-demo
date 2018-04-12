package com.netease.zzx.test;

/**
 * Created by hzzhangzongxing.
 * on 2017/9/27
 */
public class PaperSectionDto {
   private Long sectionId;

    public PaperSectionDto(Long sectionId) {
        this.sectionId = sectionId;
    }

    public Long getSectionId() {
        return sectionId;
    }

    public void setSectionId(Long sectionId) {
        this.sectionId = sectionId;
    }
}
