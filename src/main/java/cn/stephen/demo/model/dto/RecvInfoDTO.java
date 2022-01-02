package cn.stephen.demo.model.dto;

import cn.stephen.demo.model.entity.RecvInvoice;
import cn.stephen.demo.model.enums.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 * 应收账（保理商或供应商添加的数据）
 *
 * @author zhaozilong
 * @since 2021-03-08 15:37:46
 */
@Data
public class RecvInfoDTO {
    /**
     * 主键
     */
    private String id;
    /**
     * 资产来源
     */
    private AssetSourceEnum assetSource;
    /**
     * 应收账类型
     */
    private RecvTypeEnum recvType;
    /**
     * 合同名称
     */
    private String contractName;
    /**
     * 合同编号
     */
    private String contractCode;
    /**
     * 渠道号
     */
    private Long chlId;
    /**
     * 合同金额
     */
    private BigDecimal contractAmt;
    /**
     * 合同签订日期
     */
    private LocalDate contractSignDate;
    /**
     * 合同到期日
     */
    private LocalDate contractDueDate;
    /**
     * 买方企业名称
     */
    private String buyerEntName;

    /**
     * 买方类型
     */
    private BuyerTypeEnum buyerType;


    /**
     * 买方企业信用代码
     */
    private String buyerEntCreditCode;

    /**
     * 卖方企业名称
     */
    private String sellerEntName;
    /**
     * 卖方企业信用代码
     */
    private String sellerEntCreditCode;

    /**
     * 应收账款到期日
     */
    private LocalDate recvDueDate;

    /**
     * 应用账款金额
     */
    private BigDecimal recvAmt;
    /**
     * 回款金额
     * 应收帐还款时修改
     */
    private BigDecimal paybackAmt;
    /**
     * 是否结清
     */
    private Boolean settled;
    /**
     * 确权方式
     */
    private RightModeEnum rightMode;
    /**
     * 融资金额
     */
    private BigDecimal sellAmt;

    /**
     * 已还本金
     * 提前还款/按期还款/应收帐清分时修改
     */
    private BigDecimal repaidPrincipal;

    /**
     * 是否逾期
     */
    private Boolean overDue;

    /**
     * 应收账款状态
     */
    private RecvStateEnum recvState;

    /**
     * 发票列表
     */
    List<RecvInvoice> invoiceList;

}