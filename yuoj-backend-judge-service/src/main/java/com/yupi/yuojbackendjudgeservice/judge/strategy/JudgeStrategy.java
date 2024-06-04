package com.yupi.yuojbackendjudgeservice.judge.strategy;


import com.yupi.yuojbackendmodel.codesandbox.JudgeInfo;

/**
 * ClassName: JudgeStrategy
 * Package: com.yupi.yuoj.judge.strategy
 * Description:
 *
 * @Author 张宽
 * @Create 2024/5/31 20:02
 * @Version 1.0
 */
public interface JudgeStrategy {
    JudgeInfo doJudge(JudgeContext judgeContext);
}
