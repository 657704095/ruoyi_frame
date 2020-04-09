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
import com.api.project.system.domain.TFeedback;
import com.api.project.system.service.ITFeedbackService;
import com.api.framework.web.controller.BaseController;
import com.api.framework.web.domain.AjaxResult;
import com.api.common.utils.poi.ExcelUtil;
import com.api.framework.web.page.TableDataInfo;

/**
 * 反馈，建议Controller
 * 
 * @author api
 * @date 2020-04-09
 */
@RestController
@RequestMapping("/system/feedback")
public class TFeedbackController extends BaseController
{
    @Autowired
    private ITFeedbackService tFeedbackService;

    /**
     * 查询反馈，建议列表
     */
    @PreAuthorize("@ss.hasPermi('system:feedback:list')")
    @GetMapping("/list")
    public TableDataInfo list(TFeedback tFeedback)
    {
        startPage();
        List<TFeedback> list = tFeedbackService.selectTFeedbackList(tFeedback);
        return getDataTable(list);
    }

    /**
     * 导出反馈，建议列表
     */
    @PreAuthorize("@ss.hasPermi('system:feedback:export')")
    @Log(title = "反馈，建议", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(TFeedback tFeedback)
    {
        List<TFeedback> list = tFeedbackService.selectTFeedbackList(tFeedback);
        ExcelUtil<TFeedback> util = new ExcelUtil<TFeedback>(TFeedback.class);
        return util.exportExcel(list, "feedback");
    }

    /**
     * 获取反馈，建议详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:feedback:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(tFeedbackService.selectTFeedbackById(id));
    }

    /**
     * 新增反馈，建议
     */
    @PreAuthorize("@ss.hasPermi('system:feedback:add')")
    @Log(title = "反馈，建议", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TFeedback tFeedback)
    {
        return toAjax(tFeedbackService.insertTFeedback(tFeedback));
    }

    /**
     * 修改反馈，建议
     */
    @PreAuthorize("@ss.hasPermi('system:feedback:edit')")
    @Log(title = "反馈，建议", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TFeedback tFeedback)
    {
        return toAjax(tFeedbackService.updateTFeedback(tFeedback));
    }

    /**
     * 删除反馈，建议
     */
    @PreAuthorize("@ss.hasPermi('system:feedback:remove')")
    @Log(title = "反馈，建议", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tFeedbackService.deleteTFeedbackByIds(ids));
    }
}
