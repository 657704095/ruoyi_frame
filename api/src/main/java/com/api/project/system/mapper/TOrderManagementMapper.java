package com.api.project.system.mapper;

import java.util.List;
import com.api.project.system.domain.TOrderManagement;

/**
 * 订单管理Mapper接口
 * 
 * @author api
 * @date 2020-04-09
 */
public interface TOrderManagementMapper 
{
    /**
     * 查询订单管理
     * 
     * @param id 订单管理ID
     * @return 订单管理
     */
    public TOrderManagement selectTOrderManagementById(Long id);

    /**
     * 查询订单管理列表
     * 
     * @param tOrderManagement 订单管理
     * @return 订单管理集合
     */
    public List<TOrderManagement> selectTOrderManagementList(TOrderManagement tOrderManagement);

    /**
     * 新增订单管理
     * 
     * @param tOrderManagement 订单管理
     * @return 结果
     */
    public int insertTOrderManagement(TOrderManagement tOrderManagement);

    /**
     * 修改订单管理
     * 
     * @param tOrderManagement 订单管理
     * @return 结果
     */
    public int updateTOrderManagement(TOrderManagement tOrderManagement);

    /**
     * 删除订单管理
     * 
     * @param id 订单管理ID
     * @return 结果
     */
    public int deleteTOrderManagementById(Long id);

    /**
     * 批量删除订单管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTOrderManagementByIds(Long[] ids);
}
