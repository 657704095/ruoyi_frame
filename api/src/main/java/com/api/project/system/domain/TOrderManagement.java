package com.api.project.system.domain;

import com.api.framework.aspectj.lang.annotation.Excel;
import com.api.framework.web.domain.BaseEntity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Date;

/**
 * 订单管理对象 t_order_management
 * 
 * @author api
 * @date 2020-04-09
 */
public class TOrderManagement extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 订单编号 */
    @Excel(name = "订单编号")
    private String orderNumber;

    /** 提交时间 */
    @Excel(name = "提交时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date submitEvent;

    /** 价格 */
    @Excel(name = "价格")
    private Long orderPrice;

    /** 运单价格 */
    @Excel(name = "运单价格")
    private Long waybillPrice;

    /** 物流号 */
    @Excel(name = "物流号")
    private String logisticsNumber;

    /** 用户id */
    @Excel(name = "用户id")
    private Long userId;

    /** 省份 */
    @Excel(name = "省份")
    private String harvestAddressProvince;

    /** 城市 */
    @Excel(name = "城市")
    private String harvestAddressCity;

    /** 县城 */
    @Excel(name = "县城")
    private String harvestAddressCounty;

    /** 街道 */
    @Excel(name = "街道")
    private String harvestAddressStreetOrTown;

    /** 订单状(0态未支付 1已完成) */
    @Excel(name = "订单状(0态未支付 1已完成)")
    private Long orderState;

    /** 发货状态(1已发货 0未发货) */
    @Excel(name = "发货状态(1已发货 0未发货)")
    private Long shippingStatus;

    /** 1微信2支付宝3其他 */
    @Excel(name = "1微信2支付宝3其他")
    private Long modePayment;

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
    public void setOrderNumber(String orderNumber) 
    {
        this.orderNumber = orderNumber;
    }

    public String getOrderNumber() 
    {
        return orderNumber;
    }
    public void setSubmitEvent(Date submitEvent) 
    {
        this.submitEvent = submitEvent;
    }

    public Date getSubmitEvent() 
    {
        return submitEvent;
    }
    public void setOrderPrice(Long orderPrice) 
    {
        this.orderPrice = orderPrice;
    }

    public Long getOrderPrice() 
    {
        return orderPrice;
    }
    public void setWaybillPrice(Long waybillPrice) 
    {
        this.waybillPrice = waybillPrice;
    }

    public Long getWaybillPrice() 
    {
        return waybillPrice;
    }
    public void setLogisticsNumber(String logisticsNumber) 
    {
        this.logisticsNumber = logisticsNumber;
    }

    public String getLogisticsNumber() 
    {
        return logisticsNumber;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setHarvestAddressProvince(String harvestAddressProvince) 
    {
        this.harvestAddressProvince = harvestAddressProvince;
    }

    public String getHarvestAddressProvince() 
    {
        return harvestAddressProvince;
    }
    public void setHarvestAddressCity(String harvestAddressCity) 
    {
        this.harvestAddressCity = harvestAddressCity;
    }

    public String getHarvestAddressCity() 
    {
        return harvestAddressCity;
    }
    public void setHarvestAddressCounty(String harvestAddressCounty) 
    {
        this.harvestAddressCounty = harvestAddressCounty;
    }

    public String getHarvestAddressCounty() 
    {
        return harvestAddressCounty;
    }
    public void setHarvestAddressStreetOrTown(String harvestAddressStreetOrTown) 
    {
        this.harvestAddressStreetOrTown = harvestAddressStreetOrTown;
    }

    public String getHarvestAddressStreetOrTown() 
    {
        return harvestAddressStreetOrTown;
    }
    public void setOrderState(Long orderState) 
    {
        this.orderState = orderState;
    }

    public Long getOrderState() 
    {
        return orderState;
    }
    public void setShippingStatus(Long shippingStatus) 
    {
        this.shippingStatus = shippingStatus;
    }

    public Long getShippingStatus() 
    {
        return shippingStatus;
    }
    public void setModePayment(Long modePayment) 
    {
        this.modePayment = modePayment;
    }

    public Long getModePayment() 
    {
        return modePayment;
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
            .append("orderNumber", getOrderNumber())
            .append("submitEvent", getSubmitEvent())
            .append("orderPrice", getOrderPrice())
            .append("waybillPrice", getWaybillPrice())
            .append("logisticsNumber", getLogisticsNumber())
            .append("userId", getUserId())
            .append("harvestAddressProvince", getHarvestAddressProvince())
            .append("harvestAddressCity", getHarvestAddressCity())
            .append("harvestAddressCounty", getHarvestAddressCounty())
            .append("harvestAddressStreetOrTown", getHarvestAddressStreetOrTown())
            .append("orderState", getOrderState())
            .append("shippingStatus", getShippingStatus())
            .append("modePayment", getModePayment())
            .append("language", getLanguage())
            .append("modificationTime", getModificationTime())
            .append("addTime", getAddTime())
            .toString();
    }
}
