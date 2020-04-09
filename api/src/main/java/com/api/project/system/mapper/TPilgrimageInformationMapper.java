package com.api.project.system.mapper;

import java.util.List;
import com.api.project.system.domain.TPilgrimageInformation;

/**
 * 信息管理Mapper接口
 * 
 * @author api
 * @date 2020-04-09
 */
public interface TPilgrimageInformationMapper 
{
    /**
     * 查询信息管理
     * 
     * @param id 信息管理ID
     * @return 信息管理
     */
    public TPilgrimageInformation selectTPilgrimageInformationById(Long id);

    /**
     * 查询信息管理列表
     * 
     * @param tPilgrimageInformation 信息管理
     * @return 信息管理集合
     */
    public List<TPilgrimageInformation> selectTPilgrimageInformationList(TPilgrimageInformation tPilgrimageInformation);

    /**
     * 新增信息管理
     * 
     * @param tPilgrimageInformation 信息管理
     * @return 结果
     */
    public int insertTPilgrimageInformation(TPilgrimageInformation tPilgrimageInformation);

    /**
     * 修改信息管理
     * 
     * @param tPilgrimageInformation 信息管理
     * @return 结果
     */
    public int updateTPilgrimageInformation(TPilgrimageInformation tPilgrimageInformation);

    /**
     * 删除信息管理
     * 
     * @param id 信息管理ID
     * @return 结果
     */
    public int deleteTPilgrimageInformationById(Long id);

    /**
     * 批量删除信息管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTPilgrimageInformationByIds(Long[] ids);
}
