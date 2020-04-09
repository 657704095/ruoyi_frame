package com.api.project.system.domain;

import com.api.framework.aspectj.lang.annotation.Excel;
import com.api.framework.web.domain.BaseEntity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Date;

/**
 * 商品对象 t_commodity
 * 
 * @author api
 * @date 2020-04-09
 */
public class TCommodity extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 商品 */
    @Excel(name = "商品")
    private String name;

    /** 图片url */
    @Excel(name = "图片url")
    private String img;

    /** 图片视频url */
    @Excel(name = "大图片视频url")
    private String imgMax;

    /** 简介 */
    @Excel(name = "简介")
    private String intro;

    /** 价格 */
    @Excel(name = "价格")
    private Long price;

    /** html */
    @Excel(name = "html")
    private String html;

    /** 货号 */
    @Excel(name = "货号")
    private String artNo;

    /** 1上2下架标签 */
    @Excel(name = "1上2下架标签")
    private String tag;

    /** 销量 */
    @Excel(name = "销量")
    private Long salesVolume;

    /** 顺序 */
    @Excel(name = "顺序")
    private String order;

    /** $column.columnComment */
    @Excel(name = "顺序", width = 30, dateFormat = "yyyy-MM-dd")
    private Date addDate;

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

    public String getImgMax() {
        return imgMax;
    }

    public void setImgMax(String imgMax) {
        this.imgMax = imgMax;
    }

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
    public void setPrice(Long price) 
    {
        this.price = price;
    }

    public Long getPrice() 
    {
        return price;
    }
    public void setHtml(String html) 
    {
        this.html = html;
    }

    public String getHtml() 
    {
        return html;
    }
    public void setArtNo(String artNo) 
    {
        this.artNo = artNo;
    }

    public String getArtNo() 
    {
        return artNo;
    }
    public void setTag(String tag) 
    {
        this.tag = tag;
    }

    public String getTag() 
    {
        return tag;
    }
    public void setSalesVolume(Long salesVolume) 
    {
        this.salesVolume = salesVolume;
    }

    public Long getSalesVolume() 
    {
        return salesVolume;
    }
    public void setOrder(String order) 
    {
        this.order = order;
    }

    public String getOrder() 
    {
        return order;
    }
    public void setAddDate(Date addDate) 
    {
        this.addDate = addDate;
    }

    public Date getAddDate() 
    {
        return addDate;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("img", getImg())
            .append("intro", getIntro())
            .append("price", getPrice())
            .append("html", getHtml())
            .append("artNo", getArtNo())
            .append("tag", getTag())
            .append("salesVolume", getSalesVolume())
            .append("order", getOrder())
            .append("addDate", getAddDate())
            .append("addId", getAddId())
            .append("modifyId", getModifyId())
            .append("language", getLanguage())
            .append("modificationTime", getModificationTime())
            .toString();
    }
}
