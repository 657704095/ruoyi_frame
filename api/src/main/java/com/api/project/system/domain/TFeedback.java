package com.api.project.system.domain;

import com.api.framework.aspectj.lang.annotation.Excel;
import com.api.framework.web.domain.BaseEntity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Date;

/**
 * 反馈，建议对象 t_feedback
 * 
 * @author api
 * @date 2020-04-09
 */
public class TFeedback extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 反馈时间 */
    @Excel(name = "反馈时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date feedbackTime;

    /** 内容 */
    @Excel(name = "内容")
    private String content;

    /** $column.columnComment */
    @Excel(name = "内容", width = 30, dateFormat = "yyyy-MM-dd")
    private Date modificationTime;

    /** $column.columnComment */
    @Excel(name = "内容", width = 30, dateFormat = "yyyy-MM-dd")
    private Date addTime;

    /** 添加用户 */
    @Excel(name = "添加用户")
    private Long addId;

    /** 修改用户 */
    @Excel(name = "修改用户")
    private Long modifyId;

    /** 语言 */
    @Excel(name = "语言")
    private Long language;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setFeedbackTime(Date feedbackTime) 
    {
        this.feedbackTime = feedbackTime;
    }

    public Date getFeedbackTime() 
    {
        return feedbackTime;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("feedbackTime", getFeedbackTime())
            .append("content", getContent())
            .append("modificationTime", getModificationTime())
            .append("addTime", getAddTime())
            .append("addId", getAddId())
            .append("modifyId", getModifyId())
            .append("language", getLanguage())
            .toString();
    }
}
