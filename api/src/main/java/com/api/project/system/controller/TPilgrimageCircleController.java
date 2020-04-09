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
import com.api.project.system.domain.TPilgrimageCircle;
import com.api.project.system.service.ITPilgrimageCircleService;
import com.api.framework.web.controller.BaseController;
import com.api.framework.web.domain.AjaxResult;
import com.api.common.utils.poi.ExcelUtil;
import com.api.framework.web.page.TableDataInfo;

/**
 * 朝圣圈Controller
 * 
 * @author api
 * @date 2020-04-09
 */
@RestController
@RequestMapping("/system/circle")
public class TPilgrimageCircleController extends BaseController
{
    @Autowired
    private ITPilgrimageCircleService tPilgrimageCircleService;

    /**
     * 查询朝圣圈列表
     */
    @PreAuthorize("@ss.hasPermi('system:circle:list')")
    @GetMapping("/list")
    public TableDataInfo list(TPilgrimageCircle tPilgrimageCircle)
    {
        startPage();
        List<TPilgrimageCircle> list = tPilgrimageCircleService.selectTPilgrimageCircleList(tPilgrimageCircle);
        return getDataTable(list);
    }

    /**
     * 导出朝圣圈列表
     */
    @PreAuthorize("@ss.hasPermi('system:circle:export')")
    @Log(title = "朝圣圈", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(TPilgrimageCircle tPilgrimageCircle)
    {
        List<TPilgrimageCircle> list = tPilgrimageCircleService.selectTPilgrimageCircleList(tPilgrimageCircle);
        ExcelUtil<TPilgrimageCircle> util = new ExcelUtil<TPilgrimageCircle>(TPilgrimageCircle.class);
        return util.exportExcel(list, "circle");
    }

    /**
     * 获取朝圣圈详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:circle:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(tPilgrimageCircleService.selectTPilgrimageCircleById(id));
    }

    /**
     * 新增朝圣圈
     */
    @PreAuthorize("@ss.hasPermi('system:circle:add')")
    @Log(title = "朝圣圈", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TPilgrimageCircle tPilgrimageCircle)
    {
        return toAjax(tPilgrimageCircleService.insertTPilgrimageCircle(tPilgrimageCircle));
    }

    /**
     * 修改朝圣圈
     */
    @PreAuthorize("@ss.hasPermi('system:circle:edit')")
    @Log(title = "朝圣圈", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TPilgrimageCircle tPilgrimageCircle)
    {
        return toAjax(tPilgrimageCircleService.updateTPilgrimageCircle(tPilgrimageCircle));
    }

    /**
     * 删除朝圣圈
     */
    @PreAuthorize("@ss.hasPermi('system:circle:remove')")
    @Log(title = "朝圣圈", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tPilgrimageCircleService.deleteTPilgrimageCircleByIds(ids));
    }
}
