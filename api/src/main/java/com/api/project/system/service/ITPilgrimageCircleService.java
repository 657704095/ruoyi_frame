package com.api.project.system.service;

import java.util.List;
import com.api.project.system.domain.TPilgrimageCircle;

/**
 * 朝圣圈Service接口
 * 
 * @author api
 * @date 2020-04-09
 */
public interface ITPilgrimageCircleService 
{
    /**
     * 查询朝圣圈
     * 
     * @param id 朝圣圈ID
     * @return 朝圣圈
     */
    public TPilgrimageCircle selectTPilgrimageCircleById(Long id);

    /**
     * 查询朝圣圈列表
     * 
     * @param tPilgrimageCircle 朝圣圈
     * @return 朝圣圈集合
     */
    public List<TPilgrimageCircle> selectTPilgrimageCircleList(TPilgrimageCircle tPilgrimageCircle);

    /**
     * 新增朝圣圈
     * 
     * @param tPilgrimageCircle 朝圣圈
     * @return 结果
     */
    public int insertTPilgrimageCircle(TPilgrimageCircle tPilgrimageCircle);

    /**
     * 修改朝圣圈
     * 
     * @param tPilgrimageCircle 朝圣圈
     * @return 结果
     */
    public int updateTPilgrimageCircle(TPilgrimageCircle tPilgrimageCircle);

    /**
     * 批量删除朝圣圈
     * 
     * @param ids 需要删除的朝圣圈ID
     * @return 结果
     */
    public int deleteTPilgrimageCircleByIds(Long[] ids);

    /**
     * 删除朝圣圈信息
     * 
     * @param id 朝圣圈ID
     * @return 结果
     */
    public int deleteTPilgrimageCircleById(Long id);
}
