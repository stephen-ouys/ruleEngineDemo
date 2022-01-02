package cn.stephen.demo.model.enums;

import cn.stephen.demo.model.entity.Dictionary;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author TangYh
 * @Date 2020/6/10 10:11 上午
 * @Version 1.0
 * @Description
 * @RecvTypeEnum 01 - 工程款
 * 02 - 材料采购
 * 03 - 日化用品
 * 04 - 劳务费用
 * 05 - 商品交易
 * 99 - 其他
 **/
@Getter
@AllArgsConstructor
public enum RecvTypeEnum implements Dictionary<String, String> {

    TYPE_01("01", "工程款"),
    TYPE_02("02", "材料采购"),
    TYPE_03("03", "日化用品"),
    TYPE_04("04", "劳务费用"),
    TYPE_05("05", "商品交易"),
    TYPE_07("06", "购房款"),
    TYPE_06("99", "其他");


    private final String code;
    private final String name;

}
