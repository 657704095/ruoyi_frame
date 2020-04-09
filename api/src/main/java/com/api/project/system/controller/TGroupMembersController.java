package com.api.project.system.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.framework.aspectj.lang.annotation.Log;
import com.api.framework.aspectj.lang.enums.BusinessType;
import com.api.project.system.domain.TGroupMembers;
import com.api.project.system.service.ITGroupMembersService;
import com.api.framework.web.controller.BaseController;
import com.api.framework.web.domain.AjaxResult;
import com.api.common.utils.poi.ExcelUtil;
import com.api.framework.web.page.TableDataInfo;

/**
 * 团成员Controller
 * 
 * @author api
 * @date 2020-04-09
 */
@RestController
@RequestMapping("/system/members")
public class TGroupMembersController extends BaseController
{
    @Autowired
    private ITGroupMembersService tGroupMembersService;

    /**
     * 查询团成员列表
     */
    @PreAuthorize("@ss.hasPermi('system:members:list')")
    @GetMapping("/list")
    public TableDataInfo list(TGroupMembers tGroupMembers)
    {
        startPage();
        List<TGroupMembers> list = tGroupMembersService.selectTGroupMembersList(tGroupMembers);
        return getDataTable(list);
    }

    /**
     * 导出团成员列表
     */
    @PreAuthorize("@ss.hasPermi('system:members:export')")
    @Log(title = "团成员", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(TGroupMembers tGroupMembers)
    {
        List<TGroupMembers> list = tGroupMembersService.selectTGroupMembersList(tGroupMembers);
        ExcelUtil<TGroupMembers> util = new ExcelUtil<TGroupMembers>(TGroupMembers.class);
        return util.exportExcel(list, "members");
    }

    /**
     * 获取团成员详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:members:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(tGroupMembersService.selectTGroupMembersById(id));
    }

    /**
     * 新增团成员
     */
    @PreAuthorize("@ss.hasPermi('system:members:add')")
    @Log(title = "团成员", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TGroupMembers tGroupMembers)
    {
        return toAjax(tGroupMembersService.insertTGroupMembers(tGroupMembers));
    }

    /**
     * 修改团成员
     */
    @PreAuthorize("@ss.hasPermi('system:members:edit')")
    @Log(title = "团成员", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TGroupMembers tGroupMembers)
    {
        return toAjax(tGroupMembersService.updateTGroupMembers(tGroupMembers));
    }

    /**
     * 删除团成员
     */
    @PreAuthorize("@ss.hasPermi('system:members:remove')")
    @Log(title = "团成员", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tGroupMembersService.deleteTGroupMembersByIds(ids));
    }
}
