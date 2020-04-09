package com.api.project.system.mapper;

import java.util.List;
import com.api.project.system.domain.TGroupAdministrators;

/**
 * 管理员团专栏Mapper接口
 * 
 * @author api
 * @date 2020-04-09
 */
public interface TGroupAdministratorsMapper 
{
    /**
     * 查询管理员团专栏
     * 
     * @param id 管理员团专栏ID
     * @return 管理员团专栏
     */
    public TGroupAdministrators selectTGroupAdministratorsById(Long id);

    /**
     * 查询管理员团专栏列表
     * 
     * @param tGroupAdministrators 管理员团专栏
     * @return 管理员团专栏集合
     */
    public List<TGroupAdministrators> selectTGroupAdministratorsList(TGroupAdministrators tGroupAdministrators);

    /**
     * 新增管理员团专栏
     * 
     * @param tGroupAdministrators 管理员团专栏
     * @return 结果
     */
    public int insertTGroupAdministrators(TGroupAdministrators tGroupAdministrators);

    /**
     * 修改管理员团专栏
     * 
     * @param tGroupAdministrators 管理员团专栏
     * @return 结果
     */
    public int updateTGroupAdministrators(TGroupAdministrators tGroupAdministrators);

    /**
     * 删除管理员团专栏
     * 
     * @param id 管理员团专栏ID
     * @return 结果
     */
    public int deleteTGroupAdministratorsById(Long id);

    /**
     * 批量删除管理员团专栏
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTGroupAdministratorsByIds(Long[] ids);
}
