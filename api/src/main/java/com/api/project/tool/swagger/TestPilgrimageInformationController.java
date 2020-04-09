package com.api.project.tool.swagger;

import com.api.common.utils.poi.ExcelUtil;
import com.api.framework.aspectj.lang.annotation.Log;
import com.api.framework.aspectj.lang.enums.BusinessType;
import com.api.framework.web.controller.BaseController;
import com.api.framework.web.domain.AjaxResult;
import com.api.framework.web.page.TableDataInfo;
import com.api.project.system.domain.TPilgrimageInformation;
import com.api.project.system.service.ITPilgrimageInformationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 信息管理Controller
 * 
 * @author api
 * @date 2020-04-09
 */
@Api("朝圣信息管理")
@RestController
@RequestMapping("/test/information")
public class TestPilgrimageInformationController extends BaseController
{
    @Autowired
    private ITPilgrimageInformationService tPilgrimageInformationService;

    /**
     * 查询信息管理列表
     */
    @ApiOperation("查询信息管理列表")
    @PreAuthorize("@ss.hasPermi('system:information:list')")
    @GetMapping("/list")
    public TableDataInfo list(TPilgrimageInformation tPilgrimageInformation)
    {
        startPage();
        List<TPilgrimageInformation> list = tPilgrimageInformationService.selectTPilgrimageInformationList(tPilgrimageInformation);
        return getDataTable(list);
    }

    /**
     * 导出信息管理列表
     */
    @ApiOperation("导出信息管理列表")
    @PreAuthorize("@ss.hasPermi('system:information:export')")
    @Log(title = "信息管理", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(TPilgrimageInformation tPilgrimageInformation)
    {
        List<TPilgrimageInformation> list = tPilgrimageInformationService.selectTPilgrimageInformationList(tPilgrimageInformation);
        ExcelUtil<TPilgrimageInformation> util = new ExcelUtil<TPilgrimageInformation>(TPilgrimageInformation.class);
        return util.exportExcel(list, "information");
    }

    /**
     * 获取信息管理详细信息
     */
    @ApiOperation("获取信息管理详细信息")
    @PreAuthorize("@ss.hasPermi('system:information:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(tPilgrimageInformationService.selectTPilgrimageInformationById(id));
    }

    /**
     * 新增信息管理
     */
    @ApiOperation("新增信息管理")
    @PreAuthorize("@ss.hasPermi('system:information:add')")
    @Log(title = "信息管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TPilgrimageInformation tPilgrimageInformation)
    {
        return toAjax(tPilgrimageInformationService.insertTPilgrimageInformation(tPilgrimageInformation));
    }

    /**
     * 修改信息管理
     */
    @ApiOperation("修改信息管理")
    //@PreAuthorize("@ss.hasPermi('system:information:edit')")
    @Log(title = "信息管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TPilgrimageInformation tPilgrimageInformation)
    {
        return toAjax(tPilgrimageInformationService.updateTPilgrimageInformation(tPilgrimageInformation));
    }

    /**
     * 删除信息管理
     */
    @ApiOperation("删除信息管理")
    //@PreAuthorize("@ss.hasPermi('system:information:remove')")
    @Log(title = "信息管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tPilgrimageInformationService.deleteTPilgrimageInformationByIds(ids));
    }
}
