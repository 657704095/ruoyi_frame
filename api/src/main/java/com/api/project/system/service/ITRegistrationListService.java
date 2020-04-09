package com.api.project.system.service;

import java.util.List;
import com.api.project.system.domain.TRegistrationList;

/**
 * 报名列Service接口
 * 
 * @author api
 * @date 2020-04-09
 */
public interface ITRegistrationListService 
{
    /**
     * 查询报名列
     * 
     * @param id 报名列ID
     * @return 报名列
     */
    public TRegistrationList selectTRegistrationListById(Long id);

    /**
     * 查询报名列列表
     * 
     * @param tRegistrationList 报名列
     * @return 报名列集合
     */
    public List<TRegistrationList> selectTRegistrationListList(TRegistrationList tRegistrationList);

    /**
     * 新增报名列
     * 
     * @param tRegistrationList 报名列
     * @return 结果
     */
    public int insertTRegistrationList(TRegistrationList tRegistrationList);

    /**
     * 修改报名列
     * 
     * @param tRegistrationList 报名列
     * @return 结果
     */
    public int updateTRegistrationList(TRegistrationList tRegistrationList);

    /**
     * 批量删除报名列
     * 
     * @param ids 需要删除的报名列ID
     * @return 结果
     */
    public int deleteTRegistrationListByIds(Long[] ids);

    /**
     * 删除报名列信息
     * 
     * @param id 报名列ID
     * @return 结果
     */
    public int deleteTRegistrationListById(Long id);
}
