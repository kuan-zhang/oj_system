package com.yupi.yuojbackendmodel.dto.questionsubmit;


import com.yupi.yuojbackendcommon.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * ClassName: QuestionSubmitQueryRequest
 * Package: com.yupi.yuoj.model.dto.questionsubmit
 * Description:
 *
 * @Author 张宽
 * @Create 2024/5/29 15:46
 * @Version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class QuestionSubmitQueryRequest extends PageRequest implements Serializable {
    /**
     * 编程语言
     */
    private String language;

    /**
     * 用户代码
     */
    private Integer status;



    /**
     * 题目id
     */
    private Long questionId;
    private Long userId;


    private static final long serialVersionUID = 1L;
}
