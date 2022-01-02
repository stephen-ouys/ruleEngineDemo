package cn.stephen.demo.model.enums;

import cn.stephen.demo.model.entity.Dictionary;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 发票来源
 *
 * @author zhaozilong
 */
@Getter
@AllArgsConstructor
public enum InvoiceSourceEnum implements Dictionary<String, String> {

    OCR("OCR", "OCR识别"),
    INPUT("INPUT", "手工输入");

    private final String code;
    private final String name;

    public static InvoiceSourceEnum getByCode(String code) {
        for (InvoiceSourceEnum e : InvoiceSourceEnum.values()) {
            if (e.getCode().equals(code)) {
                return e;
            }
        }
        return null;
    }


}
