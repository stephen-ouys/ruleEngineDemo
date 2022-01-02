package cn.stephen.demo.model.enums;

import cn.stephen.demo.model.entity.Dictionary;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Zhaozilong
 * @version 1.0
 * 业务类型
 * @date 2021/3/24 15:39
 */
@Getter
@AllArgsConstructor
public enum BusinessTypeEnum implements Dictionary<String,String> {

    FACTORING ("RECV_FACTORING", "应收账款保理业务"),
    REFACTORING ("REFACTORING", "再保理业务");

    private final String code;
    private final String name;
}
