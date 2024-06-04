package com.yupi.yuojbackendmodel.codesandbox;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * ClassName: ExecuteCodeRequest
 * Package: com.yupi.yuoj.judge.codesandbox.model
 * Description:
 *
 * @Author 张宽
 * @Create 2024/5/31 16:04
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExecuteCodeRequest {
    private List<String> inputList;
    private String code;
    private String language;
}
