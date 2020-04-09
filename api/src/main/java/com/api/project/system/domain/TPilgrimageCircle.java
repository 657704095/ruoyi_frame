package com.api.project.system.domain;

import com.api.framework.aspectj.lang.annotation.Excel;
import com.api.framework.web.domain.BaseEntity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Date;

/**
 * 朝圣圈对象 t_pilgrimage_circle
 * 
 * @author api
 * @date 2020-04-09
 */
public class TPilgrimageCircle extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 用户id */
    @Excel(name = "用户id")
    private Long userId;

    /** 用户头像 */
    @Excel(name = "用户头像")
    private String userHeadPortrait;

    /** 用户昵称 */
    @Excel(name = "用户昵称")
    private String userName;

    /** 1未通过、2待审核、3通过 */
    @Excel(name = "1未通过、2待审核、3通过")
    private Long audit;

    /** 发布图片 */
    @Excel(name = "发布图片")
    private String img;

    /** 文字 */
    @Excel(name = "文字")
    private String postMessage;

    /** 添加用户 */
    @Excel(name = "添加用户")
    private Long addId;

    /** img字段类型1视频2图片 */
    @Excel(name = "img字段类型1视频2图片")
    private Long type;

    /** 语言 */
    @Excel(name = "语言")
    private Long language;

    /** 修改id */
    @Excel(name = "修改id")
    private Long modifyId;

    /** $column.columnComment */
    @Excel(name = "修改id", width = 30, dateFormat = "yyyy-MM-dd")
    private Date modificationTime;

    /** $column.columnComment */
    @Excel(name = "修改id", width = 30, dateFormat = "yyyy-MM-dd")
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
    public void setUserHeadPortrait(String userHeadPortrait) 
    {
        this.userHeadPortrait = userHeadPortrait;
    }

    public String getUserHeadPortrait() 
    {
        return userHeadPortrait;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setAudit(Long audit) 
    {
        this.audit = audit;
    }

    public Long getAudit() 
    {
        return audit;
    }
    public void setImg(String img) 
    {
        this.img = img;
    }

    public String getImg() 
    {
        return img;
    }
    public void setPostMessage(String postMessage) 
    {
        this.postMessage = postMessage;
    }

    public String getPostMessage() 
    {
        return postMessage;
    }
    public void setAddId(Long addId) 
    {
        this.addId = addId;
    }

    public Long getAddId() 
    {
        return addId;
    }
    public void setType(Long type) 
    {
        this.type = type;
    }

    public Long getType() 
    {
        return type;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("userHeadPortrait", getUserHeadPortrait())
            .append("userName", getUserName())
            .append("audit", getAudit())
            .append("img", getImg())
            .append("postMessage", getPostMessage())
            .append("addId", getAddId())
            .append("type", getType())
            .append("language", getLanguage())
            .append("modifyId", getModifyId())
            .append("modificationTime", getModificationTime())
            .append("addTime", getAddTime())
            .toString();
    }
}
