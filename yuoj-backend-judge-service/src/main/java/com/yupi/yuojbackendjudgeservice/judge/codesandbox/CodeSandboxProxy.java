package com.yupi.yuojbackendjudgeservice.judge.codesandbox;


import com.yupi.yuojbackendmodel.codesandbox.ExecuteCodeRequest;
import com.yupi.yuojbackendmodel.codesandbox.ExecuteCodeResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * ClassName: CodeSandboxProxy
 * Package: com.yupi.yuoj.judge.codesandbox
 * Description:
 *
 * @Author 张宽
 * @Create 2024/5/31 16:44
 * @Version 1.0
 */
@Slf4j
public class CodeSandboxProxy implements CodeSandbox{
    @Autowired
    private final CodeSandbox codeSandbox;
    public CodeSandboxProxy(CodeSandbox codeSandbox){
        this.codeSandbox=codeSandbox;
    }
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        log.info("代码沙箱请求信息");
        ExecuteCodeResponse executeCodeResponse = codeSandbox.executeCode(executeCodeRequest);
        log.info("代码沙箱响应信息");
        return executeCodeResponse;
    }
}
