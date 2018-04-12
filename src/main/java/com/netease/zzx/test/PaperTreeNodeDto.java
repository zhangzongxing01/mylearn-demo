package com.netease.zzx.test;

/**
 * Created by hzzhangzongxing.
 * on 2017/9/27
 */
public class PaperTreeNodeDto {
    /**
     * 节点ID
     */
    private Long id;

    /**
     * 资源类型(com.netease.edu.eds.paper.constants.PaperTreeNodeConstants.ResourceTypeEnum)
     */
    private Integer resourceType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getResourceType() {
        return resourceType;
    }

    public void setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
    }
}
