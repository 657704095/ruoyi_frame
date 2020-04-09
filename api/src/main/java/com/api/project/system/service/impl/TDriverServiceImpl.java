package com.api.project.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.project.system.mapper.TDriverMapper;
import com.api.project.system.domain.TDriver;
import com.api.project.system.service.ITDriverService;

/**
 * 司机Service业务层处理
 * 
 * @author api
 * @date 2020-04-09
 */
@Service
public class TDriverServiceImpl implements ITDriverService 
{
    @Autowired
    private TDriverMapper tDriverMapper;

    /**
     * 查询司机
     * 
     * @param id 司机ID
     * @return 司机
     */
    @Override
    public TDriver selectTDriverById(Long id)
    {
        return tDriverMapper.selectTDriverById(id);
    }

    /**
     * 查询司机列表
     * 
     * @param tDriver 司机
     * @return 司机
     */
    @Override
    public List<TDriver> selectTDriverList(TDriver tDriver)
    {
        return tDriverMapper.selectTDriverList(tDriver);
    }

    /**
     * 新增司机
     * 
     * @param tDriver 司机
     * @return 结果
     */
    @Override
    public int insertTDriver(TDriver tDriver)
    {
        return tDriverMapper.insertTDriver(tDriver);
    }

    /**
     * 修改司机
     * 
     * @param tDriver 司机
     * @return 结果
     */
    @Override
    public int updateTDriver(TDriver tDriver)
    {
        return tDriverMapper.updateTDriver(tDriver);
    }

    /**
     * 批量删除司机
     * 
     * @param ids 需要删除的司机ID
     * @return 结果
     */
    @Override
    public int deleteTDriverByIds(Long[] ids)
    {
        return tDriverMapper.deleteTDriverByIds(ids);
    }

    /**
     * 删除司机信息
     * 
     * @param id 司机ID
     * @return 结果
     */
    @Override
    public int deleteTDriverById(Long id)
    {
        return tDriverMapper.deleteTDriverById(id);
    }
}
