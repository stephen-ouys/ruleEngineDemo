package cn.stephen.demo.model.enums;

import cn.stephen.demo.model.entity.Dictionary;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author zjl
 * @version 1.0
 */
@Getter
@AllArgsConstructor
public enum BuyerTypeEnum implements Dictionary<String,String> {

    ENTERPRISE("ENTERPRISE","企业"),
    PERSON("PERSON","个人");

    private final String code;
    private final String name;
}
