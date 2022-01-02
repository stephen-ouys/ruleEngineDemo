package cn.stephen.demo.model.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 产品分期表(fcloud_stage)实体类
 *
 * @author zhaozilong
 * @since 2021-03-04 20:31:26
 */
@Data
public class Stage {
    private static final long serialVersionUID = -37254090877784833L;
    /**
     * 分期代号
     */
    private String stageId;
    /**
     * 分期名称
     */
    private String name;

    /**
     * 分期名称,对外名称
     */
    private String showStageName;
    /**
     * 产品代号
     */
    private String projectId;
    /**
     * 期次
     */
    private Integer seqNo;

    /**
     * 开始日期
     */
    private LocalDate startDate;

    /**
     * 截止日期
     */
    private LocalDate endDate;

    /**
     * 借款金额范围-下限
     */
    private BigDecimal minLoanMoney;

    /**
     * 借款金额范围-上限
     */
    private BigDecimal maxLoanMoney;

    /**
     * 借款期限-下限
     */
    private Integer minLoanDays;

    /**
     * 借款期限-上限
     */
    private Integer maxLoanDays;

    /**
     * 最高融资比例
     */
    private BigDecimal maxFinancePer;

    /**
     * 保证金比例
     */
    private BigDecimal securityPer;

    /**
     * 宽限期
     */
    private Integer graceDays;

    /**
     * 每年计息天数
     */
    private Integer daysPerYear;

    /**
     * 备注
     */
    private String remark;


}
