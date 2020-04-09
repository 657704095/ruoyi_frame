package com.api.project.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.project.system.mapper.TOrderManagementMapper;
import com.api.project.system.domain.TOrderManagement;
import com.api.project.system.service.ITOrderManagementService;

/**
 * 订单管理Service业务层处理
 * 
 * @author api
 * @date 2020-04-09
 */
@Service
public class TOrderManagementServiceImpl implements ITOrderManagementService 
{
    @Autowired
    private TOrderManagementMapper tOrderManagementMapper;

    /**
     * 查询订单管理
     * 
     * @param id 订单管理ID
     * @return 订单管理
     */
    @Override
    public TOrderManagement selectTOrderManagementById(Long id)
    {
        return tOrderManagementMapper.selectTOrderManagementById(id);
    }

    /**
     * 查询订单管理列表
     * 
     * @param tOrderManagement 订单管理
     * @return 订单管理
     */
    @Override
    public List<TOrderManagement> selectTOrderManagementList(TOrderManagement tOrderManagement)
    {
        return tOrderManagementMapper.selectTOrderManagementList(tOrderManagement);
    }

    /**
     * 新增订单管理
     * 
     * @param tOrderManagement 订单管理
     * @return 结果
     */
    @Override
    public int insertTOrderManagement(TOrderManagement tOrderManagement)
    {
        return tOrderManagementMapper.insertTOrderManagement(tOrderManagement);
    }

    /**
     * 修改订单管理
     * 
     * @param tOrderManagement 订单管理
     * @return 结果
     */
    @Override
    public int updateTOrderManagement(TOrderManagement tOrderManagement)
    {
        return tOrderManagementMapper.updateTOrderManagement(tOrderManagement);
    }

    /**
     * 批量删除订单管理
     * 
     * @param ids 需要删除的订单管理ID
     * @return 结果
     */
    @Override
    public int deleteTOrderManagementByIds(Long[] ids)
    {
        return tOrderManagementMapper.deleteTOrderManagementByIds(ids);
    }

    /**
     * 删除订单管理信息
     * 
     * @param id 订单管理ID
     * @return 结果
     */
    @Override
    public int deleteTOrderManagementById(Long id)
    {
        return tOrderManagementMapper.deleteTOrderManagementById(id);
    }
}
