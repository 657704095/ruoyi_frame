package com.api.project.system.service;

import java.util.List;
import com.api.project.system.domain.TGroupMembers;

/**
 * 团成员Service接口
 * 
 * @author api
 * @date 2020-04-09
 */
public interface ITGroupMembersService 
{
    /**
     * 查询团成员
     * 
     * @param id 团成员ID
     * @return 团成员
     */
    public TGroupMembers selectTGroupMembersById(Long id);

    /**
     * 查询团成员列表
     * 
     * @param tGroupMembers 团成员
     * @return 团成员集合
     */
    public List<TGroupMembers> selectTGroupMembersList(TGroupMembers tGroupMembers);

    /**
     * 新增团成员
     * 
     * @param tGroupMembers 团成员
     * @return 结果
     */
    public int insertTGroupMembers(TGroupMembers tGroupMembers);

    /**
     * 修改团成员
     * 
     * @param tGroupMembers 团成员
     * @return 结果
     */
    public int updateTGroupMembers(TGroupMembers tGroupMembers);

    /**
     * 批量删除团成员
     * 
     * @param ids 需要删除的团成员ID
     * @return 结果
     */
    public int deleteTGroupMembersByIds(Long[] ids);

    /**
     * 删除团成员信息
     * 
     * @param id 团成员ID
     * @return 结果
     */
    public int deleteTGroupMembersById(Long id);
}
