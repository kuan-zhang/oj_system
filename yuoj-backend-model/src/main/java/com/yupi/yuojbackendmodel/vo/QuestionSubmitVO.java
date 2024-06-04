package com.yupi.yuojbackendmodel.vo;

import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import com.yupi.yuojbackendcommon.common.PageRequest;
import com.yupi.yuojbackendmodel.codesandbox.JudgeInfo;
import com.yupi.yuojbackendmodel.entity.QuestionSubmit;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.util.Date;

/**
 * ClassName: QuestionSubmitVO
 * Package: com.yupi.yuoj.model.vo
 * Description:
 *
 * @Author 张宽
 * @Create 2024/5/29 15:54
 * @Version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class QuestionSubmitVO extends PageRequest implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 编程语言
     */
    private String language;

    /**
     * 用户代码
     */
    private String code;

    /**
     * 判题信息(json对象)
     */
    private JudgeInfo judgeInfo;

    /**
     * 判题状态(0-待判题、1-判题中、2-成功、3-失败)
     */
    private Integer status;

    /**
     * 题目id
     */
    private Long questionId;

    /**
     * 创建用户id
     */
    private Long userId;

    /**
     * 更新时间
     */
    private Date updateTime;
    private UserVO userVO;
    private QuestionVo questionVO;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
    public static QuestionSubmitVO voToObj(QuestionSubmit questionSubmit){
        if(questionSubmit==null){
            return null;
        }
        QuestionSubmitVO questionSubmitVO=new QuestionSubmitVO();
        BeanUtils.copyProperties(questionSubmit,questionSubmitVO);
        String judgeInfo = questionSubmit.getJudgeInfo();
        questionSubmitVO.setJudgeInfo(JSONUtil.toBean(judgeInfo,JudgeInfo.class));
        return questionSubmitVO;
    }
}
