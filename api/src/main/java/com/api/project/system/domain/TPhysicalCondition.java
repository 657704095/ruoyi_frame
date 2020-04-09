package com.api.project.system.domain;

import com.api.framework.aspectj.lang.annotation.Excel;
import com.api.framework.web.domain.BaseEntity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Date;

/**
 * 健康状况对象 t_physical_condition
 * 
 * @author api
 * @date 2020-04-09
 */
public class TPhysicalCondition extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 疾病名称 */
    @Excel(name = "疾病名称")
    private String name;

    /** $column.columnComment */
    @Excel(name = "疾病名称", width = 30, dateFormat = "yyyy-MM-dd")
    private Date modificationTime;

    /** $column.columnComment */
    @Excel(name = "疾病名称", width = 30, dateFormat = "yyyy-MM-dd")
    private Date addTime;

    /** 修改用户 */
    @Excel(name = "修改用户")
    private Long modifyId;

    /** 添加用户 */
    @Excel(name = "添加用户")
    private Long addId;

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
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
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
    public void setModifyId(Long modifyId) 
    {
        this.modifyId = modifyId;
    }

    public Long getModifyId() 
    {
        return modifyId;
    }
    public void setAddId(Long addId) 
    {
        this.addId = addId;
    }

    public Long getAddId() 
    {
        return addId;
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
            .append("name", getName())
            .append("modificationTime", getModificationTime())
            .append("addTime", getAddTime())
            .append("modifyId", getModifyId())
            .append("addId", getAddId())
            .append("language", getLanguage())
            .toString();
    }
}
