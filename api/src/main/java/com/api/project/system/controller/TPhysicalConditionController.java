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
import com.api.project.system.domain.TPhysicalCondition;
import com.api.project.system.service.ITPhysicalConditionService;
import com.api.framework.web.controller.BaseController;
import com.api.framework.web.domain.AjaxResult;
import com.api.common.utils.poi.ExcelUtil;
import com.api.framework.web.page.TableDataInfo;

/**
 * 健康状况Controller
 * 
 * @author api
 * @date 2020-04-09
 */
@RestController
@RequestMapping("/system/condition")
public class TPhysicalConditionController extends BaseController
{
    @Autowired
    private ITPhysicalConditionService tPhysicalConditionService;

    /**
     * 查询健康状况列表
     */
    @PreAuthorize("@ss.hasPermi('system:condition:list')")
    @GetMapping("/list")
    public TableDataInfo list(TPhysicalCondition tPhysicalCondition)
    {
        startPage();
        List<TPhysicalCondition> list = tPhysicalConditionService.selectTPhysicalConditionList(tPhysicalCondition);
        return getDataTable(list);
    }

    /**
     * 导出健康状况列表
     */
    @PreAuthorize("@ss.hasPermi('system:condition:export')")
    @Log(title = "健康状况", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(TPhysicalCondition tPhysicalCondition)
    {
        List<TPhysicalCondition> list = tPhysicalConditionService.selectTPhysicalConditionList(tPhysicalCondition);
        ExcelUtil<TPhysicalCondition> util = new ExcelUtil<TPhysicalCondition>(TPhysicalCondition.class);
        return util.exportExcel(list, "condition");
    }

    /**
     * 获取健康状况详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:condition:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(tPhysicalConditionService.selectTPhysicalConditionById(id));
    }

    /**
     * 新增健康状况
     */
    @PreAuthorize("@ss.hasPermi('system:condition:add')")
    @Log(title = "健康状况", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TPhysicalCondition tPhysicalCondition)
    {
        return toAjax(tPhysicalConditionService.insertTPhysicalCondition(tPhysicalCondition));
    }

    /**
     * 修改健康状况
     */
    @PreAuthorize("@ss.hasPermi('system:condition:edit')")
    @Log(title = "健康状况", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TPhysicalCondition tPhysicalCondition)
    {
        return toAjax(tPhysicalConditionService.updateTPhysicalCondition(tPhysicalCondition));
    }

    /**
     * 删除健康状况
     */
    @PreAuthorize("@ss.hasPermi('system:condition:remove')")
    @Log(title = "健康状况", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tPhysicalConditionService.deleteTPhysicalConditionByIds(ids));
    }
}
