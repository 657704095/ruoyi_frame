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
import com.api.project.system.domain.TRegistrationList;
import com.api.project.system.service.ITRegistrationListService;
import com.api.framework.web.controller.BaseController;
import com.api.framework.web.domain.AjaxResult;
import com.api.common.utils.poi.ExcelUtil;
import com.api.framework.web.page.TableDataInfo;

/**
 * 报名列Controller
 * 
 * @author api
 * @date 2020-04-09
 */
@RestController
@RequestMapping("/system/list")
public class TRegistrationListController extends BaseController
{
    @Autowired
    private ITRegistrationListService tRegistrationListService;

    /**
     * 查询报名列列表
     */
    @PreAuthorize("@ss.hasPermi('system:list:list')")
    @GetMapping("/list")
    public TableDataInfo list(TRegistrationList tRegistrationList)
    {
        startPage();
        List<TRegistrationList> list = tRegistrationListService.selectTRegistrationListList(tRegistrationList);
        return getDataTable(list);
    }

    /**
     * 导出报名列列表
     */
    @PreAuthorize("@ss.hasPermi('system:list:export')")
    @Log(title = "报名列", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(TRegistrationList tRegistrationList)
    {
        List<TRegistrationList> list = tRegistrationListService.selectTRegistrationListList(tRegistrationList);
        ExcelUtil<TRegistrationList> util = new ExcelUtil<TRegistrationList>(TRegistrationList.class);
        return util.exportExcel(list, "list");
    }

    /**
     * 获取报名列详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:list:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(tRegistrationListService.selectTRegistrationListById(id));
    }

    /**
     * 新增报名列
     */
    @PreAuthorize("@ss.hasPermi('system:list:add')")
    @Log(title = "报名列", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TRegistrationList tRegistrationList)
    {
        return toAjax(tRegistrationListService.insertTRegistrationList(tRegistrationList));
    }

    /**
     * 修改报名列
     */
    @PreAuthorize("@ss.hasPermi('system:list:edit')")
    @Log(title = "报名列", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TRegistrationList tRegistrationList)
    {
        return toAjax(tRegistrationListService.updateTRegistrationList(tRegistrationList));
    }

    /**
     * 删除报名列
     */
    @PreAuthorize("@ss.hasPermi('system:list:remove')")
    @Log(title = "报名列", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tRegistrationListService.deleteTRegistrationListByIds(ids));
    }
}
