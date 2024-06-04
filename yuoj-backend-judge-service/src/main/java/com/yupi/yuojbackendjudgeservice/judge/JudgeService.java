package com.yupi.yuojbackendjudgeservice.judge;


import com.yupi.yuojbackendmodel.entity.QuestionSubmit;

/**
 * ClassName: JudgeService
 * Package: com.yupi.yuoj.judge.JudgeService
 * Description:
 *
 * @Author 张宽
 * @Create 2024/5/31 17:05
 * @Version 1.0
 */
public interface JudgeService {
    QuestionSubmit doJudge(long questionSubmitId);
}
