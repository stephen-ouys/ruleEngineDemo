package cn.stephen.demo.model.enums;

import cn.stephen.demo.model.entity.Dictionary;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Zhaozilong
 * @version 1.0
 * 发票验真状态
 * @date 2021/6/29 14:37
 */
@AllArgsConstructor
@Getter
public enum InvoiceVerifyStatus implements Dictionary<String,String> {
    NOT_VERIFY ("NOT_VERIFY", "待验真"),
    FAKE ("FAKE", "假票"),
    VERIFIED ("VERIFIED", "已验真");
    
    private String code;
    private String name;
}
