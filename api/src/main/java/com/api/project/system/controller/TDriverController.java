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
import com.api.project.system.domain.TDriver;
import com.api.project.system.service.ITDriverService;
import com.api.framework.web.controller.BaseController;
import com.api.framework.web.domain.AjaxResult;
import com.api.common.utils.poi.ExcelUtil;
import com.api.framework.web.page.TableDataInfo;

/**
 * 司机Controller
 * 
 * @author api
 * @date 2020-04-09
 */
@RestController
@RequestMapping("/system/driver")
public class TDriverController extends BaseController
{
    @Autowired
    private ITDriverService tDriverService;

    /**
     * 查询司机列表
     */
    @PreAuthorize("@ss.hasPermi('system:driver:list')")
    @GetMapping("/list")
    public TableDataInfo list(TDriver tDriver)
    {
        startPage();
        List<TDriver> list = tDriverService.selectTDriverList(tDriver);
        return getDataTable(list);
    }

    /**
     * 导出司机列表
     */
    @PreAuthorize("@ss.hasPermi('system:driver:export')")
    @Log(title = "司机", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(TDriver tDriver)
    {
        List<TDriver> list = tDriverService.selectTDriverList(tDriver);
        ExcelUtil<TDriver> util = new ExcelUtil<TDriver>(TDriver.class);
        return util.exportExcel(list, "driver");
    }

    /**
     * 获取司机详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:driver:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(tDriverService.selectTDriverById(id));
    }

    /**
     * 新增司机
     */
    @PreAuthorize("@ss.hasPermi('system:driver:add')")
    @Log(title = "司机", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TDriver tDriver)
    {
        return toAjax(tDriverService.insertTDriver(tDriver));
    }

    /**
     * 修改司机
     */
    @PreAuthorize("@ss.hasPermi('system:driver:edit')")
    @Log(title = "司机", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TDriver tDriver)
    {
        return toAjax(tDriverService.updateTDriver(tDriver));
    }

    /**
     * 删除司机
     */
    @PreAuthorize("@ss.hasPermi('system:driver:remove')")
    @Log(title = "司机", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tDriverService.deleteTDriverByIds(ids));
    }
}
