package cn.stephen.demo.model.enums;

import cn.stephen.demo.model.entity.Dictionary;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author TangYh
 * @Date 2020/6/10 11:17 上午
 * @Version 1.0
 * @Description
 **/
@Getter
@AllArgsConstructor
public enum RightModeEnum implements Dictionary<String, String> {

    /**
     * 确权方式
     */
    ED("ED", "商票确权"),
    CT("CT", "核心企业盖章确权"),
    FI("FI", "航信确权"),
    OTHER("OTHER", "其他确权"),
    NRM("NOT_RIGHT_MODE", "无需确权");

    /**
     * 代码
     */
    private final String code;

    /**
     * 值
     */
    private final String name;

}
