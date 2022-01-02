package cn.stephen.demo.model.enums;

import cn.stephen.demo.model.entity.Dictionary;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *
 * 资产类别
 * @Author: ouyangsheng
 * @Date: 2021/03/22
 */
@Getter
@AllArgsConstructor
public enum AssetSourceEnum implements Dictionary<String,String> {
    /**
     * 保理资产
     */
    FACTORING("FA","保理资产"),

    /**
     * 应收账款
     */
    RECEIVABLE("RECV","应收账款");

    private final String code;

    private final String name;


}
