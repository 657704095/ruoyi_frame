package com.api.project.system.domain;

import com.api.framework.aspectj.lang.annotation.Excel;
import com.api.framework.web.domain.BaseEntity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Date;

/**
 * 团成员对象 t_group_members
 * 
 * @author api
 * @date 2020-04-09
 */
public class TGroupMembers extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 所属团id */
    @Excel(name = "所属团id")
    private Long groupId;

    /** 用户账号（app上的注册账号） */
    @Excel(name = "用户账号", readConverterExp = "a=pp上的注册账号")
    private Long user;

    /** 用户姓名 */
    @Excel(name = "用户姓名")
    private String userName;

    /** 电话 */
    @Excel(name = "电话")
    private String tel;

    /** 签证状态 */
    @Excel(name = "签证状态")
    private Long visaStatus;

    /** 性别 */
    @Excel(name = "性别")
    private Long gender;

    /** 生日 */
    @Excel(name = "生日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;

    /** 健康id */
    @Excel(name = "健康id")
    private String physicalConditionId;

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
    public void setGroupId(Long groupId) 
    {
        this.groupId = groupId;
    }

    public Long getGroupId() 
    {
        return groupId;
    }
    public void setUser(Long user) 
    {
        this.user = user;
    }

    public Long getUser() 
    {
        return user;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setTel(String tel) 
    {
        this.tel = tel;
    }

    public String getTel() 
    {
        return tel;
    }
    public void setVisaStatus(Long visaStatus) 
    {
        this.visaStatus = visaStatus;
    }

    public Long getVisaStatus() 
    {
        return visaStatus;
    }
    public void setGender(Long gender) 
    {
        this.gender = gender;
    }

    public Long getGender() 
    {
        return gender;
    }
    public void setBirthday(Date birthday) 
    {
        this.birthday = birthday;
    }

    public Date getBirthday() 
    {
        return birthday;
    }
    public void setPhysicalConditionId(String physicalConditionId) 
    {
        this.physicalConditionId = physicalConditionId;
    }

    public String getPhysicalConditionId() 
    {
        return physicalConditionId;
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
            .append("groupId", getGroupId())
            .append("user", getUser())
            .append("userName", getUserName())
            .append("tel", getTel())
            .append("visaStatus", getVisaStatus())
            .append("gender", getGender())
            .append("birthday", getBirthday())
            .append("physicalConditionId", getPhysicalConditionId())
            .append("remark", getRemark())
            .append("addId", getAddId())
            .append("modifyId", getModifyId())
            .append("language", getLanguage())
            .append("modificationTime", getModificationTime())
            .append("addTime", getAddTime())
            .toString();
    }
}
