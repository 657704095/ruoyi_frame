package com.api.project.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.project.system.mapper.TGroupAdministratorsMapper;
import com.api.project.system.domain.TGroupAdministrators;
import com.api.project.system.service.ITGroupAdministratorsService;

/**
 * 管理员团专栏Service业务层处理
 * 
 * @author api
 * @date 2020-04-09
 */
@Service
public class TGroupAdministratorsServiceImpl implements ITGroupAdministratorsService 
{
    @Autowired
    private TGroupAdministratorsMapper tGroupAdministratorsMapper;

    /**
     * 查询管理员团专栏
     * 
     * @param id 管理员团专栏ID
     * @return 管理员团专栏
     */
    @Override
    public TGroupAdministrators selectTGroupAdministratorsById(Long id)
    {
        return tGroupAdministratorsMapper.selectTGroupAdministratorsById(id);
    }

    /**
     * 查询管理员团专栏列表
     * 
     * @param tGroupAdministrators 管理员团专栏
     * @return 管理员团专栏
     */
    @Override
    public List<TGroupAdministrators> selectTGroupAdministratorsList(TGroupAdministrators tGroupAdministrators)
    {
        return tGroupAdministratorsMapper.selectTGroupAdministratorsList(tGroupAdministrators);
    }

    /**
     * 新增管理员团专栏
     * 
     * @param tGroupAdministrators 管理员团专栏
     * @return 结果
     */
    @Override
    public int insertTGroupAdministrators(TGroupAdministrators tGroupAdministrators)
    {
        return tGroupAdministratorsMapper.insertTGroupAdministrators(tGroupAdministrators);
    }

    /**
     * 修改管理员团专栏
     * 
     * @param tGroupAdministrators 管理员团专栏
     * @return 结果
     */
    @Override
    public int updateTGroupAdministrators(TGroupAdministrators tGroupAdministrators)
    {
        return tGroupAdministratorsMapper.updateTGroupAdministrators(tGroupAdministrators);
    }

    /**
     * 批量删除管理员团专栏
     * 
     * @param ids 需要删除的管理员团专栏ID
     * @return 结果
     */
    @Override
    public int deleteTGroupAdministratorsByIds(Long[] ids)
    {
        return tGroupAdministratorsMapper.deleteTGroupAdministratorsByIds(ids);
    }

    /**
     * 删除管理员团专栏信息
     * 
     * @param id 管理员团专栏ID
     * @return 结果
     */
    @Override
    public int deleteTGroupAdministratorsById(Long id)
    {
        return tGroupAdministratorsMapper.deleteTGroupAdministratorsById(id);
    }
}
