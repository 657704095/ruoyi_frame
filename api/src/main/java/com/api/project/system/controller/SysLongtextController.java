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
import com.api.project.system.domain.SysLongtext;
import com.api.project.system.service.ISysLongtextService;
import com.api.framework.web.controller.BaseController;
import com.api.framework.web.domain.AjaxResult;
import com.api.common.utils.poi.ExcelUtil;
import com.api.framework.web.page.TableDataInfo;

/**
 * 系统协议Controller
 * 
 * @author api
 * @date 2020-04-06
 */
@RestController
@RequestMapping("/system/longtext")
public class SysLongtextController extends BaseController
{
    @Autowired
    private ISysLongtextService sysLongtextService;

    /**
     * 查询系统协议列表
     */
    @PreAuthorize("@ss.hasPermi('system:longtext:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysLongtext sysLongtext)
    {
        startPage();
        List<SysLongtext> list = sysLongtextService.selectSysLongtextList(sysLongtext);
        return getDataTable(list);
    }

    /**
     * 导出系统协议列表
     */
    @PreAuthorize("@ss.hasPermi('system:longtext:export')")
    @Log(title = "系统协议", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(SysLongtext sysLongtext)
    {
        List<SysLongtext> list = sysLongtextService.selectSysLongtextList(sysLongtext);
        ExcelUtil<SysLongtext> util = new ExcelUtil<SysLongtext>(SysLongtext.class);
        return util.exportExcel(list, "longtext");
    }

    /**
     * 获取系统协议详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:longtext:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(sysLongtextService.selectSysLongtextById(id));
    }

    /**
     * 新增系统协议
     */
    @PreAuthorize("@ss.hasPermi('system:longtext:add')")
    @Log(title = "系统协议", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysLongtext sysLongtext)
    {
        return toAjax(sysLongtextService.insertSysLongtext(sysLongtext));
    }

    /**
     * 修改系统协议
     */
    @PreAuthorize("@ss.hasPermi('system:longtext:edit')")
    @Log(title = "系统协议", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysLongtext sysLongtext)
    {
        return toAjax(sysLongtextService.updateSysLongtext(sysLongtext));
    }

    /**
     * 删除系统协议
     */
    @PreAuthorize("@ss.hasPermi('system:longtext:remove')")
    @Log(title = "系统协议", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sysLongtextService.deleteSysLongtextByIds(ids));
    }
}
