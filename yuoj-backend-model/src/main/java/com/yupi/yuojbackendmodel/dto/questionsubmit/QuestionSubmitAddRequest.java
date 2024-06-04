package com.yupi.yuojbackendmodel.dto.questionsubmit;

import lombok.Data;

/**
 * ClassName: QuestionSubmitAddRequest
 * Package: com.yupi.yuoj.model.dto.questionsubmit
 * Description:
 *
 * @Author 张宽
 * @Create 2024/5/28 22:21
 * @Version 1.0
 */
@Data
public class QuestionSubmitAddRequest {

    /**
     * 编程语言
     */
    private String language;

    /**
     * 用户代码
     */
    private String code;



    /**
     * 题目id
     */
    private Long questionId;


    private static final long serialVersionUID = 1L;
}
