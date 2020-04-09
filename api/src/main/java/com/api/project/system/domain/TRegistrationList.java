package com.api.project.system.domain;

import com.api.framework.aspectj.lang.annotation.Excel;
import com.api.framework.web.domain.BaseEntity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Date;

/**
 * 报名列对象 t_registration_list
 * 
 * @author api
 * @date 2020-04-09
 */
public class TRegistrationList extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 用户id */
    @Excel(name = "用户id")
    private Long userId;

    /** 用户名 */
    @Excel(name = "用户名")
    private String userName;

    /** 用户电话 */
    @Excel(name = "用户电话")
    private String userTel;

    /** 线路名称 */
    @Excel(name = "线路名称")
    private String lineName;

    /** $column.columnComment */
    @Excel(name = "线路名称", width = 30, dateFormat = "yyyy-MM-dd")
    private Date modificationTime;

    /** 价格 */
    @Excel(name = "价格")
    private Long price;

    /** 身份信息 */
    @Excel(name = "身份信息")
    private String idCard;

    /** 添加用户 */
    @Excel(name = "添加用户")
    private Long addId;

    /** 修改时间 */
    @Excel(name = "修改时间")
    private Long modifyId;

    /** 语言 */
    @Excel(name = "语言")
    private Long language;

    /** 报名日期 */
    @Excel(name = "报名日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date registrationTime;

    /** $column.columnComment */
    @Excel(name = "报名日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date addTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setUserTel(String userTel) 
    {
        this.userTel = userTel;
    }

    public String getUserTel() 
    {
        return userTel;
    }
    public void setLineName(String lineName) 
    {
        this.lineName = lineName;
    }

    public String getLineName() 
    {
        return lineName;
    }
    public void setModificationTime(Date modificationTime) 
    {
        this.modificationTime = modificationTime;
    }

    public Date getModificationTime() 
    {
        return modificationTime;
    }
    public void setPrice(Long price) 
    {
        this.price = price;
    }

    public Long getPrice() 
    {
        return price;
    }
    public void setIdCard(String idCard) 
    {
        this.idCard = idCard;
    }

    public String getIdCard() 
    {
        return idCard;
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
    public void setRegistrationTime(Date registrationTime) 
    {
        this.registrationTime = registrationTime;
    }

    public Date getRegistrationTime() 
    {
        return registrationTime;
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
            .append("userId", getUserId())
            .append("userName", getUserName())
            .append("userTel", getUserTel())
            .append("lineName", getLineName())
            .append("modificationTime", getModificationTime())
            .append("price", getPrice())
            .append("idCard", getIdCard())
            .append("addId", getAddId())
            .append("modifyId", getModifyId())
            .append("language", getLanguage())
            .append("registrationTime", getRegistrationTime())
            .append("addTime", getAddTime())
            .toString();
    }
}
