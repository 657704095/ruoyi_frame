package com.api.project.system.service;

import java.util.List;
import com.api.project.system.domain.TFeedback;

/**
 * 反馈，建议Service接口
 * 
 * @author api
 * @date 2020-04-09
 */
public interface ITFeedbackService 
{
    /**
     * 查询反馈，建议
     * 
     * @param id 反馈，建议ID
     * @return 反馈，建议
     */
    public TFeedback selectTFeedbackById(Long id);

    /**
     * 查询反馈，建议列表
     * 
     * @param tFeedback 反馈，建议
     * @return 反馈，建议集合
     */
    public List<TFeedback> selectTFeedbackList(TFeedback tFeedback);

    /**
     * 新增反馈，建议
     * 
     * @param tFeedback 反馈，建议
     * @return 结果
     */
    public int insertTFeedback(TFeedback tFeedback);

    /**
     * 修改反馈，建议
     * 
     * @param tFeedback 反馈，建议
     * @return 结果
     */
    public int updateTFeedback(TFeedback tFeedback);

    /**
     * 批量删除反馈，建议
     * 
     * @param ids 需要删除的反馈，建议ID
     * @return 结果
     */
    public int deleteTFeedbackByIds(Long[] ids);

    /**
     * 删除反馈，建议信息
     * 
     * @param id 反馈，建议ID
     * @return 结果
     */
    public int deleteTFeedbackById(Long id);
}
