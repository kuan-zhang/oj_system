package com.yupi.yuojbackendmodel.enums;

import cn.hutool.core.util.ObjectUtil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ClassName: JudgeInfoMessageEnum
 * Package: com.yupi.yuoj.model.enums
 * Description:
 *
 * @Author 张宽
 * @Create 2024/5/28 23:07
 * @Version 1.0
 */
public enum JudgeInfoMessageEnum {
    ACCEPTED("Accepted","成功"),
    WRONG_ANSWER("Wrong Answer","答案错误"),
    COMPILE_ERROR("Compile Error","编译错误"),
    MEMORY_LIMIT_EXCEEDED("Memory Limit Exceeded","内存溢出"),
    TIME_LIMIT_EXCEEDED("Time Limit Exceeded","超时"),
    WAITING("Waiting","等待中"),
    PRESENTATION_ERROR("Presentation Error","展示错误"),
    OUTPUT_LIMIT_EXCEEDED("Output Limit Exceeded","输出溢出"),
    DANGEROUS_OPERATION("Dangerous Operation","危险操作"),
    RUNTIME_ERROR("Runtime Error","运行错误"),
    SYSTEM_ERROR("System Error","系统错误");
    private final String text;
    private final String value;
    JudgeInfoMessageEnum(String text,String value){
        this.text=text;
        this.value=value;
    }
    public static List<String> getValues(){
        return Arrays.stream(values()).map(item -> item.value).collect(Collectors.toList());
    }
    public static JudgeInfoMessageEnum getEnumValue(Integer value){
        if(ObjectUtil.isEmpty(value)){
            return null;
        }
        for(JudgeInfoMessageEnum anEnum:JudgeInfoMessageEnum.values()){
            if(anEnum.value.equals(value)){
                return anEnum;
            }
        }
        return null;
    }
    public String getValue(){return value;}
    public String getText(){return text;}
}
