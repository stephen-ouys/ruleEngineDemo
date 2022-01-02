package cn.stephen.demo.model.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author Zhaozilong
 * @version 1.0
 * 发票交易双方信息
 * @date 2021/7/6 13:10
 */
@Data
public class InvoiceTraderDTO {

    /**
     * 交易方名称
     */
    @NotNull(message = "交易方名称不能为空")
    private String name;

    /**
     * 交易方开户行及帐号
     */
    private String account;

    /**
     * 交易方纳税人识别号
     */
    private String taxNo;

    /**
     * 交易方地址、电话
     */
    private String addressPhone;
}
