package com.api.project.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.project.system.mapper.TPilgrimageCircleMapper;
import com.api.project.system.domain.TPilgrimageCircle;
import com.api.project.system.service.ITPilgrimageCircleService;

/**
 * 朝圣圈Service业务层处理
 * 
 * @author api
 * @date 2020-04-09
 */
@Service
public class TPilgrimageCircleServiceImpl implements ITPilgrimageCircleService 
{
    @Autowired
    private TPilgrimageCircleMapper tPilgrimageCircleMapper;

    /**
     * 查询朝圣圈
     * 
     * @param id 朝圣圈ID
     * @return 朝圣圈
     */
    @Override
    public TPilgrimageCircle selectTPilgrimageCircleById(Long id)
    {
        return tPilgrimageCircleMapper.selectTPilgrimageCircleById(id);
    }

    /**
     * 查询朝圣圈列表
     * 
     * @param tPilgrimageCircle 朝圣圈
     * @return 朝圣圈
     */
    @Override
    public List<TPilgrimageCircle> selectTPilgrimageCircleList(TPilgrimageCircle tPilgrimageCircle)
    {
        return tPilgrimageCircleMapper.selectTPilgrimageCircleList(tPilgrimageCircle);
    }

    /**
     * 新增朝圣圈
     * 
     * @param tPilgrimageCircle 朝圣圈
     * @return 结果
     */
    @Override
    public int insertTPilgrimageCircle(TPilgrimageCircle tPilgrimageCircle)
    {
        return tPilgrimageCircleMapper.insertTPilgrimageCircle(tPilgrimageCircle);
    }

    /**
     * 修改朝圣圈
     * 
     * @param tPilgrimageCircle 朝圣圈
     * @return 结果
     */
    @Override
    public int updateTPilgrimageCircle(TPilgrimageCircle tPilgrimageCircle)
    {
        return tPilgrimageCircleMapper.updateTPilgrimageCircle(tPilgrimageCircle);
    }

    /**
     * 批量删除朝圣圈
     * 
     * @param ids 需要删除的朝圣圈ID
     * @return 结果
     */
    @Override
    public int deleteTPilgrimageCircleByIds(Long[] ids)
    {
        return tPilgrimageCircleMapper.deleteTPilgrimageCircleByIds(ids);
    }

    /**
     * 删除朝圣圈信息
     * 
     * @param id 朝圣圈ID
     * @return 结果
     */
    @Override
    public int deleteTPilgrimageCircleById(Long id)
    {
        return tPilgrimageCircleMapper.deleteTPilgrimageCircleById(id);
    }
}
