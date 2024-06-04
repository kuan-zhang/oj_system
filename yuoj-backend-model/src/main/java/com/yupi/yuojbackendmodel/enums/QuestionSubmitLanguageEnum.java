package com.yupi.yuojbackendmodel.enums;

import cn.hutool.core.util.ObjectUtil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ClassName: QuestionSubmitLanguageEnum
 * Package: com.yupi.yuoj.model.enums
 * Description:
 *
 * @Author 张宽
 * @Create 2024/5/28 23:02
 * @Version 1.0
 */
public enum QuestionSubmitLanguageEnum {
    JAVA("java","java"),
    CPP("cpp","cpp"),
    GO("go","go"),
    HTML("html","html");
    private final String text;
    private final String value;
    QuestionSubmitLanguageEnum(String text,String value){
        this.text=text;
        this.value=value;
    }
    public static List<String> getValues(){
        return Arrays.stream(values()).map(item -> item.value).collect(Collectors.toList());
    }
    public static QuestionSubmitLanguageEnum getEnumValue(String value){
        if(ObjectUtil.isEmpty(value)){
            return null;
        }
        for(QuestionSubmitLanguageEnum anEnum:QuestionSubmitLanguageEnum.values()){
            if(anEnum.value.equals(value)){
                return anEnum;
            }
        }
        return null;
    }
    public String getValue(){return value;}
    public String getText(){return text;}
}
