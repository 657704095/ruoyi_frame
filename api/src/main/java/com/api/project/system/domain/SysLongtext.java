package com.api.project.system.domain;

import com.api.framework.aspectj.lang.annotation.Excel;
import com.api.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 系统协议对象 sys_longtext
 * 
 * @author api
 * @date 2020-04-06
 */
public class SysLongtext extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** key:关键字 */
    @Excel(name = "key:关键字")
    private String longtextKey;

    /** 标题 */
    @Excel(name = "标题")
    private String longtextTitle;

    /** 内容 */
    @Excel(name = "内容")
    private String longtextContent;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setLongtextKey(String longtextKey) 
    {
        this.longtextKey = longtextKey;
    }

    public String getLongtextKey() 
    {
        return longtextKey;
    }
    public void setLongtextTitle(String longtextTitle) 
    {
        this.longtextTitle = longtextTitle;
    }

    public String getLongtextTitle() 
    {
        return longtextTitle;
    }
    public void setLongtextContent(String longtextContent) 
    {
        this.longtextContent = longtextContent;
    }

    public String getLongtextContent() 
    {
        return longtextContent;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("longtextKey", getLongtextKey())
            .append("longtextTitle", getLongtextTitle())
            .append("longtextContent", getLongtextContent())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
