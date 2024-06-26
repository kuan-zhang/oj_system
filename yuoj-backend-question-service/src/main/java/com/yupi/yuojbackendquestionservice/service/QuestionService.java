package com.yupi.yuojbackendquestionservice.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


import com.baomidou.mybatisplus.extension.service.IService;

import com.yupi.yuojbackendmodel.dto.question.QuestionQueryRequest;
import com.yupi.yuojbackendmodel.entity.Question;
import com.yupi.yuojbackendmodel.vo.QuestionVo;

import javax.servlet.http.HttpServletRequest;

/**
* @author 501ZZ
* @description 针对表【question(题目)】的数据库操作Service
* @createDate 2024-05-28 20:38:59
*/
public interface QuestionService extends IService<Question> {
    /**
     * 校验
     *
     * @param Question
     * @param add
     */
    void validQuestion(Question Question, boolean add);

    /**
     * 获取查询条件
     *
     * @param questionQueryRequest
     * @return
     */
    QueryWrapper<Question> getQueryWrapper(QuestionQueryRequest questionQueryRequest);
    

    /**
     * 获取题目封装
     *
     * @param Question
     * @param request
     * @return
     */
    QuestionVo getQuestionVO(Question Question, HttpServletRequest request);

    /**
     * 分页获取题目封装
     *
     * @param questionPage
     * @param request
     * @return
     */
    Page<QuestionVo> getQuestionVOPage(Page<Question> questionPage, HttpServletRequest request);
}
