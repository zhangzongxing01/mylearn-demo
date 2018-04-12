package com.netease.zzx.test;

/**
 * Created by hzzhangzongxing.
 * on 2017/9/27
 */
public class PaperSectionNodeDto extends PaperTreeNodeDto {
    private PaperSectionDto sectionDto;

    public PaperSectionDto getDate() {
        return sectionDto;
    }
    public void setData(PaperSectionDto sectionDto) {
        this.sectionDto = sectionDto;
    }
    public void setSectionDto(PaperSectionDto sectionDto) {
        this.sectionDto = sectionDto;
    }
}
