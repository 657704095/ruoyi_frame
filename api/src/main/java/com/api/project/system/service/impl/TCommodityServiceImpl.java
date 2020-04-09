package com.api.project.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.project.system.mapper.TCommodityMapper;
import com.api.project.system.domain.TCommodity;
import com.api.project.system.service.ITCommodityService;

/**
 * 商品Service业务层处理
 * 
 * @author api
 * @date 2020-04-09
 */
@Service
public class TCommodityServiceImpl implements ITCommodityService 
{
    @Autowired
    private TCommodityMapper tCommodityMapper;

    /**
     * 查询商品
     * 
     * @param id 商品ID
     * @return 商品
     */
    @Override
    public TCommodity selectTCommodityById(Long id)
    {
        return tCommodityMapper.selectTCommodityById(id);
    }

    /**
     * 查询商品列表
     * 
     * @param tCommodity 商品
     * @return 商品
     */
    @Override
    public List<TCommodity> selectTCommodityList(TCommodity tCommodity)
    {
        return tCommodityMapper.selectTCommodityList(tCommodity);
    }

    /**
     * 新增商品
     * 
     * @param tCommodity 商品
     * @return 结果
     */
    @Override
    public int insertTCommodity(TCommodity tCommodity)
    {
        return tCommodityMapper.insertTCommodity(tCommodity);
    }

    /**
     * 修改商品
     * 
     * @param tCommodity 商品
     * @return 结果
     */
    @Override
    public int updateTCommodity(TCommodity tCommodity)
    {
        return tCommodityMapper.updateTCommodity(tCommodity);
    }

    /**
     * 批量删除商品
     * 
     * @param ids 需要删除的商品ID
     * @return 结果
     */
    @Override
    public int deleteTCommodityByIds(Long[] ids)
    {
        return tCommodityMapper.deleteTCommodityByIds(ids);
    }

    /**
     * 删除商品信息
     * 
     * @param id 商品ID
     * @return 结果
     */
    @Override
    public int deleteTCommodityById(Long id)
    {
        return tCommodityMapper.deleteTCommodityById(id);
    }
}
