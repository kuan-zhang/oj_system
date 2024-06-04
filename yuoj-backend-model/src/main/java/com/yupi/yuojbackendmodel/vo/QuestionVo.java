package com.yupi.yuojbackendmodel.vo;

import cn.hutool.json.JSONUtil;
import com.yupi.yuojbackendmodel.dto.question.JudgeCase;
import com.yupi.yuojbackendmodel.dto.question.JudgeConfig;
import com.yupi.yuojbackendmodel.entity.Question;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.util.Date;
import java.util.List;

/**
 * ClassName: QuestionVo
 * Package: com.yupi.yuoj.model.vo
 * Description:
 *
 * @Author 张宽
 * @Create 2024/5/28 21:22
 * @Version 1.0
 */
@Data
public class QuestionVo {
    /**
     * id
     */
    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;
    private String answer;

    /**
     * 标签列表（json 数组）
     */
    private List<String> tags;

    /**
     * 题目提交数
     */
    private Integer submitNum;

    /**
     * 题目通过数
     */
    private Integer acceptedNum;
    private List<JudgeCase> judgeCase;


    /**
     * 判题配置（json 数组）
     */
    private JudgeConfig judgeConfig;

    /**
     * 点赞数
     */
    private Integer thumbNum;

    /**
     * 收藏数
     */
    private Integer favourNum;

    /**
     * 创建用户 id
     */
    private Long userId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
    private UserVO userVO;

    private static final long serialVersionUID = 1L;
    /**
     * 包装类转对象
     *
     * @param questionVo
     * @return
     */
    public static Question voToObj(QuestionVo questionVo) {
        if (questionVo == null) {
            return null;
        }
        Question question = new Question();
        BeanUtils.copyProperties(questionVo, question);
        List<String> tagList = questionVo.getTags();
        if(tagList!=null){
            question.setTags(JSONUtil.toJsonStr(tagList));
        }
        JudgeConfig judgeConfig=new JudgeConfig();
        if(judgeConfig!=null){
            question.setJudgeConfig(JSONUtil.toJsonStr(judgeConfig));
        }
        JudgeCase judgeCase=new JudgeCase();
        if(judgeCase!=null){
            question.setJudgeConfig(JSONUtil.toJsonStr(judgeCase));
        }
        return question;
    }

    /**
     * 对象转包装类
     *
     * @param question
     * @return
     */
    public static QuestionVo objToVo(Question question) {
        if (question == null) {
            return null;
        }
        QuestionVo questionVO = new QuestionVo();
        BeanUtils.copyProperties(question, questionVO);
        List<String> list = JSONUtil.toList(question.getTags(), String.class);
        questionVO.setTags(list);
        questionVO.setJudgeConfig(JSONUtil.toBean(question.getJudgeConfig(),JudgeConfig.class));
        questionVO.setJudgeCase(JSONUtil.toList(question.getJudgeCase(), JudgeCase.class));
        return questionVO;
    }
}
