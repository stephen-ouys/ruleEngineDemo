package cn.stephen.demo.model.enums;

import cn.stephen.demo.model.entity.Dictionary;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author zhaozilong
 * @Date 2020/6/11 5:47 下午
 * @Version 1.0
 * @Description
 *
 **/
@Getter
@AllArgsConstructor
public enum RecvStateEnum implements Dictionary<String,String> {

    INIT("INIT","在库"),
    ASSET_REVIEWING("ASSET_REVIEWING","资产审核中"),
    ASSET_REVIEW_COMPLETE("ASSET_REVIEW_COMPLETE","资产审核完成"),
    LOAN_APPLYING("LOAN_APPLYING","支用审核中"),
    SOLD("SOLD","已出让待结清"),
    SETTLED("SETTLED","已结清待清算"),
    CLEANED("CLEANED","已清算"),
    TRANSFERRED("TRANSFERRED","已结算"),
    EXPIRED("EXPIRED","已过期");

    private final String code;
    private final String name;
}
