package com.yupi.yuojbackendjudgeservice.judge.codesandbox.impl;

import com.yupi.yuojbackendjudgeservice.judge.codesandbox.CodeSandbox;
import com.yupi.yuojbackendmodel.codesandbox.ExecuteCodeRequest;
import com.yupi.yuojbackendmodel.codesandbox.ExecuteCodeResponse;

/**
 * ClassName: ThirdPartCodeSandbox
 * Package: com.yupi.yuoj.judge.codesandbox.impl
 * Description:
 *
 * @Author 张宽
 * @Create 2024/5/31 16:11
 * @Version 1.0
 */
public class ThirdPartCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
