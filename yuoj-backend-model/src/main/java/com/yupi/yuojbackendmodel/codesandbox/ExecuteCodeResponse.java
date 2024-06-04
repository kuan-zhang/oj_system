package com.yupi.yuojbackendmodel.codesandbox;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * ClassName: ExecuteCodeResponse
 * Package: com.yupi.yuoj.judge.codesandbox.model
 * Description:
 *
 * @Author 张宽
 * @Create 2024/5/31 16:07
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExecuteCodeResponse {
    private List<String> outputList;
    /**
     * 接口信息
     */
    private String message;
    private Integer status;
    private JudgeInfo judgeInfo;
}
