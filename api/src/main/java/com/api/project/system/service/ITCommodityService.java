package com.api.project.system.service;

import java.util.List;
import com.api.project.system.domain.TCommodity;

/**
 * 商品Service接口
 * 
 * @author api
 * @date 2020-04-09
 */
public interface ITCommodityService 
{
    /**
     * 查询商品
     * 
     * @param id 商品ID
     * @return 商品
     */
    public TCommodity selectTCommodityById(Long id);

    /**
     * 查询商品列表
     * 
     * @param tCommodity 商品
     * @return 商品集合
     */
    public List<TCommodity> selectTCommodityList(TCommodity tCommodity);

    /**
     * 新增商品
     * 
     * @param tCommodity 商品
     * @return 结果
     */
    public int insertTCommodity(TCommodity tCommodity);

    /**
     * 修改商品
     * 
     * @param tCommodity 商品
     * @return 结果
     */
    public int updateTCommodity(TCommodity tCommodity);

    /**
     * 批量删除商品
     * 
     * @param ids 需要删除的商品ID
     * @return 结果
     */
    public int deleteTCommodityByIds(Long[] ids);

    /**
     * 删除商品信息
     * 
     * @param id 商品ID
     * @return 结果
     */
    public int deleteTCommodityById(Long id);
}
