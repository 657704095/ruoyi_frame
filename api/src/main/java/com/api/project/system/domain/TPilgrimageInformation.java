package com.api.project.system.domain;

import com.api.framework.aspectj.lang.annotation.Excel;
import com.api.framework.web.domain.BaseEntity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Date;

/**
 * 信息管理对象 t_pilgrimage_information
 * 
 * @author api
 * @date 2020-04-09
 */
public class TPilgrimageInformation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 图片视频url */
    @Excel(name = "图片视频url")
    private String img;

    /** 简介 */
    @Excel(name = "简介")
    private String intro;

    /** $column.columnComment */
    @Excel(name = "简介")
    private String html;

    /** 价格 */
    @Excel(name = "价格")
    private Long price;

    /** 添加用户 */
    @Excel(name = "添加用户")
    private Long addId;

    /** 顺序 */
    @Excel(name = "顺序")
    private Long order;

    /** 语言 */
    @Excel(name = "语言")
    private Long language;

    /** 修改用户 */
    @Excel(name = "修改用户")
    private Long modifyId;

    /** $column.columnComment */
    @Excel(name = "修改用户", width = 30, dateFormat = "yyyy-MM-dd")
    private Date modificationTime;

    /** $column.columnComment */
    @Excel(name = "修改用户", width = 30, dateFormat = "yyyy-MM-dd")
    private Date addTime;

    /** 1轮播图，2朝圣信息3朝圣视频4朝圣学院5定制朝圣6朝圣慈善7签证类容8法律法规9注意事项10朝圣景点11线路管理 */
    @Excel(name = "1轮播图，2朝圣信息3朝圣视频4朝圣学院5定制朝圣6朝圣慈善7签证类容8法律法规9注意事项10朝圣景点11线路管理")
    private Long tableType;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setImg(String img) 
    {
        this.img = img;
    }

    public String getImg() 
    {
        return img;
    }
    public void setIntro(String intro) 
    {
        this.intro = intro;
    }

    public String getIntro() 
    {
        return intro;
    }
    public void setHtml(String html) 
    {
        this.html = html;
    }

    public String getHtml() 
    {
        return html;
    }
    public void setPrice(Long price) 
    {
        this.price = price;
    }

    public Long getPrice() 
    {
        return price;
    }
    public void setAddId(Long addId) 
    {
        this.addId = addId;
    }

    public Long getAddId() 
    {
        return addId;
    }
    public void setOrder(Long order) 
    {
        this.order = order;
    }

    public Long getOrder() 
    {
        return order;
    }
    public void setLanguage(Long language) 
    {
        this.language = language;
    }

    public Long getLanguage() 
    {
        return language;
    }
    public void setModifyId(Long modifyId) 
    {
        this.modifyId = modifyId;
    }

    public Long getModifyId() 
    {
        return modifyId;
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
    public void setTableType(Long tableType) 
    {
        this.tableType = tableType;
    }

    public Long getTableType() 
    {
        return tableType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("title", getTitle())
            .append("img", getImg())
            .append("intro", getIntro())
            .append("html", getHtml())
            .append("price", getPrice())
            .append("addId", getAddId())
            .append("order", getOrder())
            .append("language", getLanguage())
            .append("modifyId", getModifyId())
            .append("modificationTime", getModificationTime())
            .append("addTime", getAddTime())
            .append("tableType", getTableType())
            .toString();
    }
}
