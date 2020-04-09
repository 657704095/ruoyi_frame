package com.api.project.system.domain;

import com.api.framework.aspectj.lang.annotation.Excel;
import com.api.framework.web.domain.BaseEntity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Date;

/**
 * 管理员团专栏对象 t_group_administrators
 * 
 * @author api
 * @date 2020-04-09
 */
public class TGroupAdministrators extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 团名 */
    @Excel(name = "团名")
    private String groupName;

    /** 开始时间 */
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date beginTime;

    /** 结束时间 */
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 导游id */
    @Excel(name = "导游id")
    private String tourId;

    /** 外联人员id */
    @Excel(name = "外联人员id")
    private Long outreachWorkersId;

    /** 1待审核，2已审核，3不通过 */
    @Excel(name = "1待审核，2已审核，3不通过")
    private Long state;

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
    public void setGroupName(String groupName) 
    {
        this.groupName = groupName;
    }

    public String getGroupName() 
    {
        return groupName;
    }
    public void setBeginTime(Date beginTime) 
    {
        this.beginTime = beginTime;
    }

    public Date getBeginTime() 
    {
        return beginTime;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }
    public void setTourId(String tourId) 
    {
        this.tourId = tourId;
    }

    public String getTourId() 
    {
        return tourId;
    }
    public void setOutreachWorkersId(Long outreachWorkersId) 
    {
        this.outreachWorkersId = outreachWorkersId;
    }

    public Long getOutreachWorkersId() 
    {
        return outreachWorkersId;
    }
    public void setState(Long state) 
    {
        this.state = state;
    }

    public Long getState() 
    {
        return state;
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
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("groupName", getGroupName())
            .append("beginTime", getBeginTime())
            .append("endTime", getEndTime())
            .append("tourId", getTourId())
            .append("outreachWorkersId", getOutreachWorkersId())
            .append("state", getState())
            .append("addId", getAddId())
            .append("modifyId", getModifyId())
            .append("language", getLanguage())
            .append("modificationTime", getModificationTime())
            .append("addTime", getAddTime())
            .toString();
    }
}
