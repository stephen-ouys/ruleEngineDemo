package cn.stephen.demo.model.entity;

import cn.stephen.demo.model.dto.InvoiceTraderDTO;
import cn.stephen.demo.model.enums.InvoiceSourceEnum;
import cn.stephen.demo.model.enums.InvoiceTypeEnum;
import cn.stephen.demo.model.enums.InvoiceVerifyStatus;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 应收账款发票记录表(FcloudRecvInvoice)实体类
 *
 * @author zhaozilong
 * @since 2021-03-15 15:30:31
 */
@Data
public class RecvInvoice  {
    private static final long serialVersionUID = -95578678296936551L;
    /**
     * 记录ID
     */
    private Long id;
    /**
     * 所属资产编号 （保理资产应收账款编号 / 供应商应收账编号）
     */
    private String recvId;
    /**
     * 专票/普票
     */
    private String invoiceFlag;

    /**
     * 发票类型
     */
    private InvoiceTypeEnum invoiceType;

    /**
     * 发票来源
     */
    private InvoiceSourceEnum invoiceSource;

    /**
     * 发票号
     */
    private String invoiceNo;
    /**
     * 发票代码
     */
    private String invoiceCode;
    /**
     * 开票日期
     */
    private LocalDate invoiceDate;
    /**
     * 发票金额（含税）
     */
    private BigDecimal invoiceAmt1;
    /**
     * 发票金额（不含税）
     */
    private BigDecimal invoiceAmt2;
    /**
     * 发票校验码
     */
    private String invoiceCaptcha;
    /**
     * 销售方信息
     */
    private InvoiceTraderDTO sellerInfo;
    /**
     * 购买方信息
     */
    private InvoiceTraderDTO buyerInfo;
    /**
     * 代开(非代开条目为空)
     */
    private String proxyMark;
    /**
     * 备注
     */
    private String remark;
    /**
     * 验真状态
     */
    private InvoiceVerifyStatus verifyStatus;
}