package com.yupi.yuojbackendjudgeservice.judge.strategy;


import com.yupi.yuojbackendmodel.codesandbox.JudgeInfo;
import com.yupi.yuojbackendmodel.dto.question.JudgeCase;
import com.yupi.yuojbackendmodel.entity.Question;
import com.yupi.yuojbackendmodel.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * ClassName: JudgeContext
 * Package: com.yupi.yuoj.judge.strategy
 * Description:
 *
 * @Author 张宽
 * @Create 2024/5/31 20:03
 * @Version 1.0
 */
@Data
public class JudgeContext {
    private JudgeInfo judgeInfo;
    private List<String> inputList;
    private List<String> outputList;
    private List<JudgeCase> judgeCases;
    private Question question;
    private QuestionSubmit questionSubmit;
}
