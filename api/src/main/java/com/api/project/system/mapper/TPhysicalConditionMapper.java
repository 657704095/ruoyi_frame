package com.api.project.system.mapper;

import java.util.List;
import com.api.project.system.domain.TPhysicalCondition;

/**
 * 健康状况Mapper接口
 * 
 * @author api
 * @date 2020-04-09
 */
public interface TPhysicalConditionMapper 
{
    /**
     * 查询健康状况
     * 
     * @param id 健康状况ID
     * @return 健康状况
     */
    public TPhysicalCondition selectTPhysicalConditionById(Long id);

    /**
     * 查询健康状况列表
     * 
     * @param tPhysicalCondition 健康状况
     * @return 健康状况集合
     */
    public List<TPhysicalCondition> selectTPhysicalConditionList(TPhysicalCondition tPhysicalCondition);

    /**
     * 新增健康状况
     * 
     * @param tPhysicalCondition 健康状况
     * @return 结果
     */
    public int insertTPhysicalCondition(TPhysicalCondition tPhysicalCondition);

    /**
     * 修改健康状况
     * 
     * @param tPhysicalCondition 健康状况
     * @return 结果
     */
    public int updateTPhysicalCondition(TPhysicalCondition tPhysicalCondition);

    /**
     * 删除健康状况
     * 
     * @param id 健康状况ID
     * @return 结果
     */
    public int deleteTPhysicalConditionById(Long id);

    /**
     * 批量删除健康状况
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTPhysicalConditionByIds(Long[] ids);
}
