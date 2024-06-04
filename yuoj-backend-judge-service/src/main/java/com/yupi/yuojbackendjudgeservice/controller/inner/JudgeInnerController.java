package com.yupi.yuojbackendjudgeservice.controller.inner;

import com.yupi.yuojbackendjudgeservice.judge.JudgeService;

import com.yupi.yuojbackendmodel.entity.QuestionSubmit;

import com.yupi.yuojbackendserviceclient.service.JudgeFeignClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * ClassName: UserInnerController
 * Package: com.yupi.yuojbackenduserservice.controller.inner
 * Description:
 *
 * @Author 张宽
 * @Create 2024/6/3 15:52
 * @Version 1.0
 */
@RestController
@RequestMapping("/inner")
public class JudgeInnerController implements JudgeFeignClient {
    @Resource
    private JudgeService judgeService;
    @PostMapping("/do")
    @Override
    public QuestionSubmit doJudge(@RequestParam("questionSubmitId") long questionSubmitId){
        return judgeService.doJudge(questionSubmitId);
    }

}
