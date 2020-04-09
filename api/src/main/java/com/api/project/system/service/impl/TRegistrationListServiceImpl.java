package com.api.project.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.project.system.mapper.TRegistrationListMapper;
import com.api.project.system.domain.TRegistrationList;
import com.api.project.system.service.ITRegistrationListService;

/**
 * 报名列Service业务层处理
 * 
 * @author api
 * @date 2020-04-09
 */
@Service
public class TRegistrationListServiceImpl implements ITRegistrationListService 
{
    @Autowired
    private TRegistrationListMapper tRegistrationListMapper;

    /**
     * 查询报名列
     * 
     * @param id 报名列ID
     * @return 报名列
     */
    @Override
    public TRegistrationList selectTRegistrationListById(Long id)
    {
        return tRegistrationListMapper.selectTRegistrationListById(id);
    }

    /**
     * 查询报名列列表
     * 
     * @param tRegistrationList 报名列
     * @return 报名列
     */
    @Override
    public List<TRegistrationList> selectTRegistrationListList(TRegistrationList tRegistrationList)
    {
        return tRegistrationListMapper.selectTRegistrationListList(tRegistrationList);
    }

    /**
     * 新增报名列
     * 
     * @param tRegistrationList 报名列
     * @return 结果
     */
    @Override
    public int insertTRegistrationList(TRegistrationList tRegistrationList)
    {
        return tRegistrationListMapper.insertTRegistrationList(tRegistrationList);
    }

    /**
     * 修改报名列
     * 
     * @param tRegistrationList 报名列
     * @return 结果
     */
    @Override
    public int updateTRegistrationList(TRegistrationList tRegistrationList)
    {
        return tRegistrationListMapper.updateTRegistrationList(tRegistrationList);
    }

    /**
     * 批量删除报名列
     * 
     * @param ids 需要删除的报名列ID
     * @return 结果
     */
    @Override
    public int deleteTRegistrationListByIds(Long[] ids)
    {
        return tRegistrationListMapper.deleteTRegistrationListByIds(ids);
    }

    /**
     * 删除报名列信息
     * 
     * @param id 报名列ID
     * @return 结果
     */
    @Override
    public int deleteTRegistrationListById(Long id)
    {
        return tRegistrationListMapper.deleteTRegistrationListById(id);
    }
}
