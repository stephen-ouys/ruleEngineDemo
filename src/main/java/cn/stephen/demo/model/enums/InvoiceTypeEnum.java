package cn.stephen.demo.model.enums;

import cn.stephen.demo.model.entity.Dictionary;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 发票类型
 *
 * @author zhaozilong
 */
@Getter
@AllArgsConstructor
public enum InvoiceTypeEnum implements Dictionary<String, String> {

    TYPE_1("1", "电子普票"),
    TYPE_3("3", "普票"),
    TYPE_4("4", "增值税专票"),
    TYPE_11("11", "其他");

    private final String code;
    private final String name;

    public static InvoiceTypeEnum getByCode(String code) {
        for (InvoiceTypeEnum e : InvoiceTypeEnum.values()) {
            if (e.getCode().equals(code)) {
                return e;
            }
        }
        return null;
    }


}
