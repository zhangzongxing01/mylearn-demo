package com.netease.k12;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * @author : ZhangPan zhangpan01@corp.netease.com
 * @version : 2018/1/23
 * @description : 统计vo
 */
public class K12MemberLiveSheetStatisticsVo implements Serializable {
    private Long id;
    private Long gmtCreate;
    private Long gmtModified;
    private Timestamp dbUpdateTime;

    /**
     * 直播id
     */
    private Long liveId;

    /**
     * 用户id
     */
    private Long memberId;

    /**
     * 用户名称
     */
    private String name;

    /**
     * 手机号
     */
    private String phoneNumber;

    /**
     * 正确个数
     */
    private Long rightCount;

    /**
     * 获奖标识
     */
    private Integer winFlag;

    /**
     * 使用复活卡标识
     */
    private Integer useRevivalFlag;

    /**
     * 备注
     */
    private String remark;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Long getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Timestamp getDbUpdateTime() {
        return dbUpdateTime;
    }

    public void setDbUpdateTime(Timestamp dbUpdateTime) {
        this.dbUpdateTime = dbUpdateTime;
    }

    public Long getLiveId() {
        return liveId;
    }

    public void setLiveId(Long liveId) {
        this.liveId = liveId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getRightCount() {
        return rightCount;
    }

    public void setRightCount(Long rightCount) {
        this.rightCount = rightCount;
    }

    public Integer getWinFlag() {
        return winFlag;
    }

    public void setWinFlag(Integer winFlag) {
        this.winFlag = winFlag;
    }

    public Integer getUseRevivalFlag() {
        return useRevivalFlag;
    }

    public void setUseRevivalFlag(Integer useRevivalFlag) {
        this.useRevivalFlag = useRevivalFlag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
