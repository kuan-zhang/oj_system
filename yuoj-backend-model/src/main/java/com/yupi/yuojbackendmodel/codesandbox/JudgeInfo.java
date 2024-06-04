package com.yupi.yuojbackendmodel.codesandbox;

import lombok.Data;

/**
 * ClassName: JudgeInfo
 * Package: com.yupi.yuoj.model.dto.questionsubmit
 * Description:
 *
 * @Author 张宽
 * @Create 2024/5/28 21:18
 * @Version 1.0
 */
@Data
public class JudgeInfo {
    private String message;
    private long memory;
    private long time;
}
