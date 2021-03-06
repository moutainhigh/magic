package com.haoqi.magic.business.model.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 功能描述:
 * 争议项分页查询
 *
 * @Author: yanhao
 * @Date: 2019/11/29 16:06
 * @Param:
 * @Description:
 */
@Data
public class CsDisputeItemQueryVO implements Serializable {

    /**
     * 类型：1买家，2卖家，3PC,默认为1
     */
    @ApiModelProperty(value = "类型：1买家，2卖家，3PC,默认为1")
    private Integer type;
    /**
     * 父争议性id
     */
    @ApiModelProperty(value = "父争议性id : 父类为0 子类为父类id")
    private Long parentId;
}
