package com.api.project.system.service.impl;

import java.util.List;
import com.api.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.project.system.mapper.SysLongtextMapper;
import com.api.project.system.domain.SysLongtext;
import com.api.project.system.service.ISysLongtextService;

/**
 * 系统协议Service业务层处理
 * 
 * @author api
 * @date 2020-04-06
 */
@Service
public class SysLongtextServiceImpl implements ISysLongtextService 
{
    @Autowired
    private SysLongtextMapper sysLongtextMapper;

    /**
     * 查询系统协议
     * 
     * @param id 系统协议ID
     * @return 系统协议
     */
    @Override
    public SysLongtext selectSysLongtextById(Long id)
    {
        return sysLongtextMapper.selectSysLongtextById(id);
    }

    /**
     * 查询系统协议列表
     * 
     * @param sysLongtext 系统协议
     * @return 系统协议
     */
    @Override
    public List<SysLongtext> selectSysLongtextList(SysLongtext sysLongtext)
    {
        return sysLongtextMapper.selectSysLongtextList(sysLongtext);
    }

    /**
     * 新增系统协议
     * 
     * @param sysLongtext 系统协议
     * @return 结果
     */
    @Override
    public int insertSysLongtext(SysLongtext sysLongtext)
    {
        sysLongtext.setCreateTime(DateUtils.getNowDate());
        return sysLongtextMapper.insertSysLongtext(sysLongtext);
    }

    /**
     * 修改系统协议
     * 
     * @param sysLongtext 系统协议
     * @return 结果
     */
    @Override
    public int updateSysLongtext(SysLongtext sysLongtext)
    {
        sysLongtext.setUpdateTime(DateUtils.getNowDate());
        return sysLongtextMapper.updateSysLongtext(sysLongtext);
    }

    /**
     * 批量删除系统协议
     * 
     * @param ids 需要删除的系统协议ID
     * @return 结果
     */
    @Override
    public int deleteSysLongtextByIds(Long[] ids)
    {
        return sysLongtextMapper.deleteSysLongtextByIds(ids);
    }

    /**
     * 删除系统协议信息
     * 
     * @param id 系统协议ID
     * @return 结果
     */
    @Override
    public int deleteSysLongtextById(Long id)
    {
        return sysLongtextMapper.deleteSysLongtextById(id);
    }
}
