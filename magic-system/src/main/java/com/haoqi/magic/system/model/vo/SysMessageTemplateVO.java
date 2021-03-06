package com.haoqi.magic.system.model.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * ClassName:com.haoyun.mirage.database.model.vo <br/>
 * Function: <br/>
 * @date 2019/5/5 17:34
 *
 * @author huming
 * @see
 * @since JDK 1.8
 */
@Data
public class SysMessageTemplateVO implements Serializable {
    private static final long serialVersionUID = 1345184435871547620L;

    /**
     * 消息唯一标识
     */
    @ApiModelProperty(value = "消息唯一标识",required = true)
    @NotNull(message = "消息唯一标识不能为空")
    @Length(min = 2,max = 100,message = "消息唯一标识长度限定在2到100之间")
    private String templateCode;

    /**
     * 消息内容
     */
    @ApiModelProperty(value = "消息内容",required = true)
    @NotNull(message = "消息内容不能为空")
    @Length(min = 2,max = 100,message = "消息内容长度限定在2到100之间")
    private String templateContent;

    /**
     * 模板变量提示内容
     */
    @ApiModelProperty(value = "模板变量提示内容",required = true)
    @NotNull(message = "模板变量不能为空")
    @Length(min = 2,max = 100,message = "模板变量长度限定在2到100之间")
    private String templateVariables;
}
