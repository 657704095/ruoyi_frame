package com.api.project.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.project.system.mapper.TPhysicalConditionMapper;
import com.api.project.system.domain.TPhysicalCondition;
import com.api.project.system.service.ITPhysicalConditionService;

/**
 * 健康状况Service业务层处理
 * 
 * @author api
 * @date 2020-04-09
 */
@Service
public class TPhysicalConditionServiceImpl implements ITPhysicalConditionService 
{
    @Autowired
    private TPhysicalConditionMapper tPhysicalConditionMapper;

    /**
     * 查询健康状况
     * 
     * @param id 健康状况ID
     * @return 健康状况
     */
    @Override
    public TPhysicalCondition selectTPhysicalConditionById(Long id)
    {
        return tPhysicalConditionMapper.selectTPhysicalConditionById(id);
    }

    /**
     * 查询健康状况列表
     * 
     * @param tPhysicalCondition 健康状况
     * @return 健康状况
     */
    @Override
    public List<TPhysicalCondition> selectTPhysicalConditionList(TPhysicalCondition tPhysicalCondition)
    {
        return tPhysicalConditionMapper.selectTPhysicalConditionList(tPhysicalCondition);
    }

    /**
     * 新增健康状况
     * 
     * @param tPhysicalCondition 健康状况
     * @return 结果
     */
    @Override
    public int insertTPhysicalCondition(TPhysicalCondition tPhysicalCondition)
    {
        return tPhysicalConditionMapper.insertTPhysicalCondition(tPhysicalCondition);
    }

    /**
     * 修改健康状况
     * 
     * @param tPhysicalCondition 健康状况
     * @return 结果
     */
    @Override
    public int updateTPhysicalCondition(TPhysicalCondition tPhysicalCondition)
    {
        return tPhysicalConditionMapper.updateTPhysicalCondition(tPhysicalCondition);
    }

    /**
     * 批量删除健康状况
     * 
     * @param ids 需要删除的健康状况ID
     * @return 结果
     */
    @Override
    public int deleteTPhysicalConditionByIds(Long[] ids)
    {
        return tPhysicalConditionMapper.deleteTPhysicalConditionByIds(ids);
    }

    /**
     * 删除健康状况信息
     * 
     * @param id 健康状况ID
     * @return 结果
     */
    @Override
    public int deleteTPhysicalConditionById(Long id)
    {
        return tPhysicalConditionMapper.deleteTPhysicalConditionById(id);
    }
}
