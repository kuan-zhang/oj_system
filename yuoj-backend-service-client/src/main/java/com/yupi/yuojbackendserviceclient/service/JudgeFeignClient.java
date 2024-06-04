package com.yupi.yuojbackendserviceclient.service;


import com.yupi.yuojbackendmodel.entity.QuestionSubmit;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ClassName: JudgeService
 * Package: com.yupi.yuoj.judge.JudgeService
 * Description:
 *
 * @Author 张宽
 * @Create 2024/5/31 17:05
 * @Version 1.0
 */
@FeignClient(name = "yuoj-backend-judge-service",path = "/api/judge/inner")
public interface JudgeFeignClient {
    @PostMapping("/do")
    QuestionSubmit doJudge(@RequestParam("questionSubmitId") long questionSubmitId);
}
