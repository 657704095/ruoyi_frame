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
import com.api.project.system.domain.TCommodity;
import com.api.project.system.service.ITCommodityService;
import com.api.framework.web.controller.BaseController;
import com.api.framework.web.domain.AjaxResult;
import com.api.common.utils.poi.ExcelUtil;
import com.api.framework.web.page.TableDataInfo;

/**
 * 商品Controller
 * 
 * @author api
 * @date 2020-04-09
 */
@RestController
@RequestMapping("/system/commodity")
public class TCommodityController extends BaseController
{
    @Autowired
    private ITCommodityService tCommodityService;

    /**
     * 查询商品列表
     */
    @PreAuthorize("@ss.hasPermi('system:commodity:list')")
    @GetMapping("/list")
    public TableDataInfo list(TCommodity tCommodity)
    {
        startPage();
        List<TCommodity> list = tCommodityService.selectTCommodityList(tCommodity);
        return getDataTable(list);
    }

    /**
     * 导出商品列表
     */
    @PreAuthorize("@ss.hasPermi('system:commodity:export')")
    @Log(title = "商品", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(TCommodity tCommodity)
    {
        List<TCommodity> list = tCommodityService.selectTCommodityList(tCommodity);
        ExcelUtil<TCommodity> util = new ExcelUtil<TCommodity>(TCommodity.class);
        return util.exportExcel(list, "commodity");
    }

    /**
     * 获取商品详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:commodity:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(tCommodityService.selectTCommodityById(id));
    }

    /**
     * 新增商品
     */
    @PreAuthorize("@ss.hasPermi('system:commodity:add')")
    @Log(title = "商品", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TCommodity tCommodity)
    {
        return toAjax(tCommodityService.insertTCommodity(tCommodity));
    }

    /**
     * 修改商品
     */
    @PreAuthorize("@ss.hasPermi('system:commodity:edit')")
    @Log(title = "商品", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TCommodity tCommodity)
    {
        return toAjax(tCommodityService.updateTCommodity(tCommodity));
    }

    /**
     * 删除商品
     */
    @PreAuthorize("@ss.hasPermi('system:commodity:remove')")
    @Log(title = "商品", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tCommodityService.deleteTCommodityByIds(ids));
    }
}
