package cn.stephen.demo.model.enums;

import cn.stephen.demo.model.entity.Dictionary;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 融资申请状态
 * @author zhaozilong
 */
@Getter
@AllArgsConstructor
public enum LoanApplyStateEnum implements Dictionary<String,String> {

    CONFIRMING ("CONFIRMING", "融资信息核实"),
    CONTRACT_REVIEWING("CONTRACT_REVIEWING","合同审核"),
    LOAN_REVIEWING("LOAN_REVIEWING","支用审核"),
    SUSPENSION("SUSPENSION","终止"),
//    LOANS_MADE("LOANS_MADE","已放款待结清"),
//    SETTLED("SETTLED","已结清待清分"),
    UNCLEAR("UNCLEAR","待清算"),
    CLEARED("CLEARED","已清算");

    private final String code;
    private final String name;
}
