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
import com.api.project.system.domain.TGroupAdministrators;
import com.api.project.system.service.ITGroupAdministratorsService;
import com.api.framework.web.controller.BaseController;
import com.api.framework.web.domain.AjaxResult;
import com.api.common.utils.poi.ExcelUtil;
import com.api.framework.web.page.TableDataInfo;

/**
 * 管理员团专栏Controller
 * 
 * @author api
 * @date 2020-04-09
 */
@RestController
@RequestMapping("/system/administrators")
public class TGroupAdministratorsController extends BaseController
{
    @Autowired
    private ITGroupAdministratorsService tGroupAdministratorsService;

    /**
     * 查询管理员团专栏列表
     */
    @PreAuthorize("@ss.hasPermi('system:administrators:list')")
    @GetMapping("/list")
    public TableDataInfo list(TGroupAdministrators tGroupAdministrators)
    {
        startPage();
        List<TGroupAdministrators> list = tGroupAdministratorsService.selectTGroupAdministratorsList(tGroupAdministrators);
        return getDataTable(list);
    }

    /**
     * 导出管理员团专栏列表
     */
    @PreAuthorize("@ss.hasPermi('system:administrators:export')")
    @Log(title = "管理员团专栏", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(TGroupAdministrators tGroupAdministrators)
    {
        List<TGroupAdministrators> list = tGroupAdministratorsService.selectTGroupAdministratorsList(tGroupAdministrators);
        ExcelUtil<TGroupAdministrators> util = new ExcelUtil<TGroupAdministrators>(TGroupAdministrators.class);
        return util.exportExcel(list, "administrators");
    }

    /**
     * 获取管理员团专栏详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:administrators:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(tGroupAdministratorsService.selectTGroupAdministratorsById(id));
    }

    /**
     * 新增管理员团专栏
     */
    @PreAuthorize("@ss.hasPermi('system:administrators:add')")
    @Log(title = "管理员团专栏", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TGroupAdministrators tGroupAdministrators)
    {
        return toAjax(tGroupAdministratorsService.insertTGroupAdministrators(tGroupAdministrators));
    }

    /**
     * 修改管理员团专栏
     */
    @PreAuthorize("@ss.hasPermi('system:administrators:edit')")
    @Log(title = "管理员团专栏", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TGroupAdministrators tGroupAdministrators)
    {
        return toAjax(tGroupAdministratorsService.updateTGroupAdministrators(tGroupAdministrators));
    }

    /**
     * 删除管理员团专栏
     */
    @PreAuthorize("@ss.hasPermi('system:administrators:remove')")
    @Log(title = "管理员团专栏", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tGroupAdministratorsService.deleteTGroupAdministratorsByIds(ids));
    }
}
