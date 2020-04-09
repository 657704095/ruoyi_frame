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
import com.api.project.system.domain.TOrderManagement;
import com.api.project.system.service.ITOrderManagementService;
import com.api.framework.web.controller.BaseController;
import com.api.framework.web.domain.AjaxResult;
import com.api.common.utils.poi.ExcelUtil;
import com.api.framework.web.page.TableDataInfo;

/**
 * 订单管理Controller
 * 
 * @author api
 * @date 2020-04-09
 */
@RestController
@RequestMapping("/system/management")
public class TOrderManagementController extends BaseController
{
    @Autowired
    private ITOrderManagementService tOrderManagementService;

    /**
     * 查询订单管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:management:list')")
    @GetMapping("/list")
    public TableDataInfo list(TOrderManagement tOrderManagement)
    {
        startPage();
        List<TOrderManagement> list = tOrderManagementService.selectTOrderManagementList(tOrderManagement);
        return getDataTable(list);
    }

    /**
     * 导出订单管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:management:export')")
    @Log(title = "订单管理", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(TOrderManagement tOrderManagement)
    {
        List<TOrderManagement> list = tOrderManagementService.selectTOrderManagementList(tOrderManagement);
        ExcelUtil<TOrderManagement> util = new ExcelUtil<TOrderManagement>(TOrderManagement.class);
        return util.exportExcel(list, "management");
    }

    /**
     * 获取订单管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:management:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(tOrderManagementService.selectTOrderManagementById(id));
    }

    /**
     * 新增订单管理
     */
    @PreAuthorize("@ss.hasPermi('system:management:add')")
    @Log(title = "订单管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TOrderManagement tOrderManagement)
    {
        return toAjax(tOrderManagementService.insertTOrderManagement(tOrderManagement));
    }

    /**
     * 修改订单管理
     */
    @PreAuthorize("@ss.hasPermi('system:management:edit')")
    @Log(title = "订单管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TOrderManagement tOrderManagement)
    {
        return toAjax(tOrderManagementService.updateTOrderManagement(tOrderManagement));
    }

    /**
     * 删除订单管理
     */
    @PreAuthorize("@ss.hasPermi('system:management:remove')")
    @Log(title = "订单管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tOrderManagementService.deleteTOrderManagementByIds(ids));
    }
}
