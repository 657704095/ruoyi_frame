package com.api.project.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.project.system.mapper.TFeedbackMapper;
import com.api.project.system.domain.TFeedback;
import com.api.project.system.service.ITFeedbackService;

/**
 * 反馈，建议Service业务层处理
 * 
 * @author api
 * @date 2020-04-09
 */
@Service
public class TFeedbackServiceImpl implements ITFeedbackService 
{
    @Autowired
    private TFeedbackMapper tFeedbackMapper;

    /**
     * 查询反馈，建议
     * 
     * @param id 反馈，建议ID
     * @return 反馈，建议
     */
    @Override
    public TFeedback selectTFeedbackById(Long id)
    {
        return tFeedbackMapper.selectTFeedbackById(id);
    }

    /**
     * 查询反馈，建议列表
     * 
     * @param tFeedback 反馈，建议
     * @return 反馈，建议
     */
    @Override
    public List<TFeedback> selectTFeedbackList(TFeedback tFeedback)
    {
        return tFeedbackMapper.selectTFeedbackList(tFeedback);
    }

    /**
     * 新增反馈，建议
     * 
     * @param tFeedback 反馈，建议
     * @return 结果
     */
    @Override
    public int insertTFeedback(TFeedback tFeedback)
    {
        return tFeedbackMapper.insertTFeedback(tFeedback);
    }

    /**
     * 修改反馈，建议
     * 
     * @param tFeedback 反馈，建议
     * @return 结果
     */
    @Override
    public int updateTFeedback(TFeedback tFeedback)
    {
        return tFeedbackMapper.updateTFeedback(tFeedback);
    }

    /**
     * 批量删除反馈，建议
     * 
     * @param ids 需要删除的反馈，建议ID
     * @return 结果
     */
    @Override
    public int deleteTFeedbackByIds(Long[] ids)
    {
        return tFeedbackMapper.deleteTFeedbackByIds(ids);
    }

    /**
     * 删除反馈，建议信息
     * 
     * @param id 反馈，建议ID
     * @return 结果
     */
    @Override
    public int deleteTFeedbackById(Long id)
    {
        return tFeedbackMapper.deleteTFeedbackById(id);
    }
}
