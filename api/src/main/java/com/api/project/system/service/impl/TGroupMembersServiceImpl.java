package com.api.project.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.project.system.mapper.TGroupMembersMapper;
import com.api.project.system.domain.TGroupMembers;
import com.api.project.system.service.ITGroupMembersService;

/**
 * 团成员Service业务层处理
 * 
 * @author api
 * @date 2020-04-09
 */
@Service
public class TGroupMembersServiceImpl implements ITGroupMembersService 
{
    @Autowired
    private TGroupMembersMapper tGroupMembersMapper;

    /**
     * 查询团成员
     * 
     * @param id 团成员ID
     * @return 团成员
     */
    @Override
    public TGroupMembers selectTGroupMembersById(Long id)
    {
        return tGroupMembersMapper.selectTGroupMembersById(id);
    }

    /**
     * 查询团成员列表
     * 
     * @param tGroupMembers 团成员
     * @return 团成员
     */
    @Override
    public List<TGroupMembers> selectTGroupMembersList(TGroupMembers tGroupMembers)
    {
        return tGroupMembersMapper.selectTGroupMembersList(tGroupMembers);
    }

    /**
     * 新增团成员
     * 
     * @param tGroupMembers 团成员
     * @return 结果
     */
    @Override
    public int insertTGroupMembers(TGroupMembers tGroupMembers)
    {
        return tGroupMembersMapper.insertTGroupMembers(tGroupMembers);
    }

    /**
     * 修改团成员
     * 
     * @param tGroupMembers 团成员
     * @return 结果
     */
    @Override
    public int updateTGroupMembers(TGroupMembers tGroupMembers)
    {
        return tGroupMembersMapper.updateTGroupMembers(tGroupMembers);
    }

    /**
     * 批量删除团成员
     * 
     * @param ids 需要删除的团成员ID
     * @return 结果
     */
    @Override
    public int deleteTGroupMembersByIds(Long[] ids)
    {
        return tGroupMembersMapper.deleteTGroupMembersByIds(ids);
    }

    /**
     * 删除团成员信息
     * 
     * @param id 团成员ID
     * @return 结果
     */
    @Override
    public int deleteTGroupMembersById(Long id)
    {
        return tGroupMembersMapper.deleteTGroupMembersById(id);
    }
}
