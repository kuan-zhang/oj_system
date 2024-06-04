package com.yupi.yuojbackendmodel.dto.question;

import lombok.Data;

/**
 * ClassName: QuestionJudgeCase
 * Package: com.yupi.yuoj.model.dto.question
 * Description:
 *
 * @Author 张宽
 * @Create 2024/5/28 21:12
 * @Version 1.0
 */
@Data
public class JudgeConfig {
    /**
     * 时间限制 ms
     */
    private long timeLimit;
    private long memoryLimit;
    private long stackLimit;
}
