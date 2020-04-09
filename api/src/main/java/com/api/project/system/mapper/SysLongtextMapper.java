package com.api.project.system.mapper;

import java.util.List;
import com.api.project.system.domain.SysLongtext;

/**
 * 系统协议Mapper接口
 * 
 * @author api
 * @date 2020-04-06
 */
public interface SysLongtextMapper 
{
    /**
     * 查询系统协议
     * 
     * @param id 系统协议ID
     * @return 系统协议
     */
    public SysLongtext selectSysLongtextById(Long id);

    /**
     * 查询系统协议列表
     * 
     * @param sysLongtext 系统协议
     * @return 系统协议集合
     */
    public List<SysLongtext> selectSysLongtextList(SysLongtext sysLongtext);

    /**
     * 新增系统协议
     * 
     * @param sysLongtext 系统协议
     * @return 结果
     */
    public int insertSysLongtext(SysLongtext sysLongtext);

    /**
     * 修改系统协议
     * 
     * @param sysLongtext 系统协议
     * @return 结果
     */
    public int updateSysLongtext(SysLongtext sysLongtext);

    /**
     * 删除系统协议
     * 
     * @param id 系统协议ID
     * @return 结果
     */
    public int deleteSysLongtextById(Long id);

    /**
     * 批量删除系统协议
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysLongtextByIds(Long[] ids);
}
