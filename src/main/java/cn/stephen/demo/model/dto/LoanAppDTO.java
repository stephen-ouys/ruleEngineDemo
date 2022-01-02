package cn.stephen.demo.model.dto;

import cn.stephen.demo.model.enums.BusinessTypeEnum;
import cn.stephen.demo.model.enums.LoanApplyStateEnum;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author ouyangsheng
 * @date 2022-01-01
 **/
@Data
public class LoanAppDTO {

    /**
     * 创建者Id
     */
    private String id;

    /**
     * 创建者Id
     */
    private Long createId;


    /**
     * 业务类型 BusinessTypeEnum,
     * FACTORING:保理业务  REFACTORING:再保理业务
     */
    private BusinessTypeEnum businessType;

    /**
     * 贷款合同编号
     */
    private String contractCode;

    /**
     * 渠道号
     */
    private Long chlId;

    /**
     * 分期代号
     */
    private String stageId;

    /**
     * 项目编号
     */
    private String projectId;

    /**
     * 申请状态
     */
    private LoanApplyStateEnum applyState;

    /**
     * 是否有逾期
     */
    private Boolean overDue;

    /**
     * 应收账总额
     */
    private BigDecimal recvTotalAmt;

    /**
     * 已回款总额（本息和）
     */
    private BigDecimal repayment;

    /**
     * 已还本金
     */
    private BigDecimal repayPrincipal;

    /**
     * 转让总金额
     */
    private BigDecimal sellAmt;

    /**
     * 实际放款金额
     */
    private BigDecimal loanAmt;

    /**
     * 实际放款日期
     */
    private LocalDate loanDate;

    /**
     * 流程ID
     */
    private String proInstId;

    /**
     * 保证金
     */
    private BigDecimal surety;

    /**
     * 备注
     */
    private String remark;

}
