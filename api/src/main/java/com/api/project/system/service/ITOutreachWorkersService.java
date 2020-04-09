package com.api.project.system.service;

import java.util.List;
import com.api.project.system.domain.TOutreachWorkers;

/**
 * 外联专栏Service接口
 * 
 * @author api
 * @date 2020-04-09
 */
public interface ITOutreachWorkersService 
{
    /**
     * 查询外联专栏
     * 
     * @param id 外联专栏ID
     * @return 外联专栏
     */
    public TOutreachWorkers selectTOutreachWorkersById(Long id);

    /**
     * 查询外联专栏列表
     * 
     * @param tOutreachWorkers 外联专栏
     * @return 外联专栏集合
     */
    public List<TOutreachWorkers> selectTOutreachWorkersList(TOutreachWorkers tOutreachWorkers);

    /**
     * 新增外联专栏
     * 
     * @param tOutreachWorkers 外联专栏
     * @return 结果
     */
    public int insertTOutreachWorkers(TOutreachWorkers tOutreachWorkers);

    /**
     * 修改外联专栏
     * 
     * @param tOutreachWorkers 外联专栏
     * @return 结果
     */
    public int updateTOutreachWorkers(TOutreachWorkers tOutreachWorkers);

    /**
     * 批量删除外联专栏
     * 
     * @param ids 需要删除的外联专栏ID
     * @return 结果
     */
    public int deleteTOutreachWorkersByIds(Long[] ids);

    /**
     * 删除外联专栏信息
     * 
     * @param id 外联专栏ID
     * @return 结果
     */
    public int deleteTOutreachWorkersById(Long id);
}
