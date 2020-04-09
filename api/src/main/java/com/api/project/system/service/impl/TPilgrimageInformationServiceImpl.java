package com.api.project.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.project.system.mapper.TPilgrimageInformationMapper;
import com.api.project.system.domain.TPilgrimageInformation;
import com.api.project.system.service.ITPilgrimageInformationService;

/**
 * 信息管理Service业务层处理
 * 
 * @author api
 * @date 2020-04-09
 */
@Service
public class TPilgrimageInformationServiceImpl implements ITPilgrimageInformationService 
{
    @Autowired
    private TPilgrimageInformationMapper tPilgrimageInformationMapper;

    /**
     * 查询信息管理
     * 
     * @param id 信息管理ID
     * @return 信息管理
     */
    @Override
    public TPilgrimageInformation selectTPilgrimageInformationById(Long id)
    {
        return tPilgrimageInformationMapper.selectTPilgrimageInformationById(id);
    }

    /**
     * 查询信息管理列表
     * 
     * @param tPilgrimageInformation 信息管理
     * @return 信息管理
     */
    @Override
    public List<TPilgrimageInformation> selectTPilgrimageInformationList(TPilgrimageInformation tPilgrimageInformation)
    {
        return tPilgrimageInformationMapper.selectTPilgrimageInformationList(tPilgrimageInformation);
    }

    /**
     * 新增信息管理
     * 
     * @param tPilgrimageInformation 信息管理
     * @return 结果
     */
    @Override
    public int insertTPilgrimageInformation(TPilgrimageInformation tPilgrimageInformation)
    {
        return tPilgrimageInformationMapper.insertTPilgrimageInformation(tPilgrimageInformation);
    }

    /**
     * 修改信息管理
     * 
     * @param tPilgrimageInformation 信息管理
     * @return 结果
     */
    @Override
    public int updateTPilgrimageInformation(TPilgrimageInformation tPilgrimageInformation)
    {
        return tPilgrimageInformationMapper.updateTPilgrimageInformation(tPilgrimageInformation);
    }

    /**
     * 批量删除信息管理
     * 
     * @param ids 需要删除的信息管理ID
     * @return 结果
     */
    @Override
    public int deleteTPilgrimageInformationByIds(Long[] ids)
    {
        return tPilgrimageInformationMapper.deleteTPilgrimageInformationByIds(ids);
    }

    /**
     * 删除信息管理信息
     * 
     * @param id 信息管理ID
     * @return 结果
     */
    @Override
    public int deleteTPilgrimageInformationById(Long id)
    {
        return tPilgrimageInformationMapper.deleteTPilgrimageInformationById(id);
    }
}
