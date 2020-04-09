package com.api.project.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.project.system.mapper.TOutreachWorkersMapper;
import com.api.project.system.domain.TOutreachWorkers;
import com.api.project.system.service.ITOutreachWorkersService;

/**
 * 外联专栏Service业务层处理
 * 
 * @author api
 * @date 2020-04-09
 */
@Service
public class TOutreachWorkersServiceImpl implements ITOutreachWorkersService 
{
    @Autowired
    private TOutreachWorkersMapper tOutreachWorkersMapper;

    /**
     * 查询外联专栏
     * 
     * @param id 外联专栏ID
     * @return 外联专栏
     */
    @Override
    public TOutreachWorkers selectTOutreachWorkersById(Long id)
    {
        return tOutreachWorkersMapper.selectTOutreachWorkersById(id);
    }

    /**
     * 查询外联专栏列表
     * 
     * @param tOutreachWorkers 外联专栏
     * @return 外联专栏
     */
    @Override
    public List<TOutreachWorkers> selectTOutreachWorkersList(TOutreachWorkers tOutreachWorkers)
    {
        return tOutreachWorkersMapper.selectTOutreachWorkersList(tOutreachWorkers);
    }

    /**
     * 新增外联专栏
     * 
     * @param tOutreachWorkers 外联专栏
     * @return 结果
     */
    @Override
    public int insertTOutreachWorkers(TOutreachWorkers tOutreachWorkers)
    {
        return tOutreachWorkersMapper.insertTOutreachWorkers(tOutreachWorkers);
    }

    /**
     * 修改外联专栏
     * 
     * @param tOutreachWorkers 外联专栏
     * @return 结果
     */
    @Override
    public int updateTOutreachWorkers(TOutreachWorkers tOutreachWorkers)
    {
        return tOutreachWorkersMapper.updateTOutreachWorkers(tOutreachWorkers);
    }

    /**
     * 批量删除外联专栏
     * 
     * @param ids 需要删除的外联专栏ID
     * @return 结果
     */
    @Override
    public int deleteTOutreachWorkersByIds(Long[] ids)
    {
        return tOutreachWorkersMapper.deleteTOutreachWorkersByIds(ids);
    }

    /**
     * 删除外联专栏信息
     * 
     * @param id 外联专栏ID
     * @return 结果
     */
    @Override
    public int deleteTOutreachWorkersById(Long id)
    {
        return tOutreachWorkersMapper.deleteTOutreachWorkersById(id);
    }
}
