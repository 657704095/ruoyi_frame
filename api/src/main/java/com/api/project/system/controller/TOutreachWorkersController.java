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
import com.api.project.system.domain.TOutreachWorkers;
import com.api.project.system.service.ITOutreachWorkersService;
import com.api.framework.web.controller.BaseController;
import com.api.framework.web.domain.AjaxResult;
import com.api.common.utils.poi.ExcelUtil;
import com.api.framework.web.page.TableDataInfo;

/**
 * 外联专栏Controller
 * 
 * @author api
 * @date 2020-04-09
 */
@RestController
@RequestMapping("/system/workers")
public class TOutreachWorkersController extends BaseController
{
    @Autowired
    private ITOutreachWorkersService tOutreachWorkersService;

    /**
     * 查询外联专栏列表
     */
    @PreAuthorize("@ss.hasPermi('system:workers:list')")
    @GetMapping("/list")
    public TableDataInfo list(TOutreachWorkers tOutreachWorkers)
    {
        startPage();
        List<TOutreachWorkers> list = tOutreachWorkersService.selectTOutreachWorkersList(tOutreachWorkers);
        return getDataTable(list);
    }

    /**
     * 导出外联专栏列表
     */
    @PreAuthorize("@ss.hasPermi('system:workers:export')")
    @Log(title = "外联专栏", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(TOutreachWorkers tOutreachWorkers)
    {
        List<TOutreachWorkers> list = tOutreachWorkersService.selectTOutreachWorkersList(tOutreachWorkers);
        ExcelUtil<TOutreachWorkers> util = new ExcelUtil<TOutreachWorkers>(TOutreachWorkers.class);
        return util.exportExcel(list, "workers");
    }

    /**
     * 获取外联专栏详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:workers:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(tOutreachWorkersService.selectTOutreachWorkersById(id));
    }

    /**
     * 新增外联专栏
     */
    @PreAuthorize("@ss.hasPermi('system:workers:add')")
    @Log(title = "外联专栏", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TOutreachWorkers tOutreachWorkers)
    {
        return toAjax(tOutreachWorkersService.insertTOutreachWorkers(tOutreachWorkers));
    }

    /**
     * 修改外联专栏
     */
    @PreAuthorize("@ss.hasPermi('system:workers:edit')")
    @Log(title = "外联专栏", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TOutreachWorkers tOutreachWorkers)
    {
        return toAjax(tOutreachWorkersService.updateTOutreachWorkers(tOutreachWorkers));
    }

    /**
     * 删除外联专栏
     */
    @PreAuthorize("@ss.hasPermi('system:workers:remove')")
    @Log(title = "外联专栏", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tOutreachWorkersService.deleteTOutreachWorkersByIds(ids));
    }
}
