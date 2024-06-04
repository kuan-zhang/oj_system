package com.yupi.yuojbackendjudgeservice.judge.codesandbox;


import com.yupi.yuojbackendmodel.codesandbox.ExecuteCodeRequest;
import com.yupi.yuojbackendmodel.codesandbox.ExecuteCodeResponse;

/**
 * ClassName: CodeSandbox
 * Package: com.yupi.yuoj.judge.codesandbox
 * Description:
 *
 * @Author 张宽
 * @Create 2024/5/31 16:01
 * @Version 1.0
 */
public interface CodeSandbox {
    /**
     * 执行代码
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
