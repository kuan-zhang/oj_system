package com.yupi.yuojbackendjudgeservice.judge.codesandbox;

import com.yupi.yuojbackendjudgeservice.judge.codesandbox.impl.ExampleCodeSandbox;
import com.yupi.yuojbackendjudgeservice.judge.codesandbox.impl.RemoteCodeSandbox;
import com.yupi.yuojbackendjudgeservice.judge.codesandbox.impl.ThirdPartCodeSandbox;

/**
 * ClassName: CodeSandboxFactory
 * Package: com.yupi.yuoj.judge.codesandbox
 * Description:
 *
 * @Author 张宽
 * @Create 2024/5/31 16:23
 * @Version 1.0
 */
public class CodeSandboxFactory {
    public static CodeSandbox newInstance(String type){
        switch (type){
            case "example":
                return new ExampleCodeSandbox();
            case "remote":
                return new RemoteCodeSandbox();
            case "thirdParty":
                return new ThirdPartCodeSandbox();
            default:
                return new ExampleCodeSandbox();
        }
    }
}
