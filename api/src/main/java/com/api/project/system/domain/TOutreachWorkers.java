package com.api.project.system.domain;

import com.api.framework.aspectj.lang.annotation.Excel;
import com.api.framework.web.domain.BaseEntity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Date;

/**
 * 外联专栏对象 t_outreach_workers
 * 
 * @author api
 * @date 2020-04-09
 */
public class TOutreachWorkers extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 外联人员id */
    @Excel(name = "外联人员id")
    private Long outreachId;

    /** 团名 */
    @Excel(name = "团名")
    private String groupName;

    /** 开始时间 */
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date beignTime;

    /** 结束时间 */
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 区分是否为1正式或2零时团 */
    @Excel(name = "区分是否为1正式或2零时团")
    private Long type;

    /** 1是2否申请为正式团 */
    @Excel(name = "1是2否申请为正式团")
    private Long applyType;

    /** 添加用户 */
    @Excel(name = "添加用户")
    private Long addId;

    /** 修改用户 */
    @Excel(name = "修改用户")
    private Long modifyId;

    /** 语言 */
    @Excel(name = "语言")
    private Long language;

    /** $column.columnComment */
    @Excel(name = "语言", width = 30, dateFormat = "yyyy-MM-dd")
    private Date modificationTime;

    /** $column.columnComment */
    @Excel(name = "语言", width = 30, dateFormat = "yyyy-MM-dd")
    private Date addTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setOutreachId(Long outreachId) 
    {
        this.outreachId = outreachId;
    }

    public Long getOutreachId() 
    {
        return outreachId;
    }
    public void setGroupName(String groupName) 
    {
        this.groupName = groupName;
    }

    public String getGroupName() 
    {
        return groupName;
    }
    public void setBeignTime(Date beignTime) 
    {
        this.beignTime = beignTime;
    }

    public Date getBeignTime() 
    {
        return beignTime;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }
    public void setType(Long type) 
    {
        this.type = type;
    }

    public Long getType() 
    {
        return type;
    }
    public void setApplyType(Long applyType) 
    {
        this.applyType = applyType;
    }

    public Long getApplyType() 
    {
        return applyType;
    }
    public void setAddId(Long addId) 
    {
        this.addId = addId;
    }

    public Long getAddId() 
    {
        return addId;
    }
    public void setModifyId(Long modifyId) 
    {
        this.modifyId = modifyId;
    }

    public Long getModifyId() 
    {
        return modifyId;
    }
    public void setLanguage(Long language) 
    {
        this.language = language;
    }

    public Long getLanguage() 
    {
        return language;
    }
    public void setModificationTime(Date modificationTime) 
    {
        this.modificationTime = modificationTime;
    }

    public Date getModificationTime() 
    {
        return modificationTime;
    }
    public void setAddTime(Date addTime) 
    {
        this.addTime = addTime;
    }

    public Date getAddTime() 
    {
        return addTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("outreachId", getOutreachId())
            .append("groupName", getGroupName())
            .append("beignTime", getBeignTime())
            .append("endTime", getEndTime())
            .append("type", getType())
            .append("applyType", getApplyType())
            .append("addId", getAddId())
            .append("modifyId", getModifyId())
            .append("language", getLanguage())
            .append("modificationTime", getModificationTime())
            .append("addTime", getAddTime())
            .toString();
    }
}
