package cn.stephen.demo.model.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Daas 企业信息
 *
 * @author ouyangsheng
 * @date 2022-01-02
 **/
@Data
public class DaasEntInfoDTO {
    private String companyId;
    private String companyName;
    private String companySnm;
    private String fenNm;
    private String otherNm;
    private String legRepresent;
    private String orgForm;
    private String foundDt;
    private BigDecimal regCapital;
    private String regAddr;
    private String companyPh;
    private String companyWeb;
    private String businScope;
    private String employNum;
    private String blnumb;
    private String ntrnum;
    private String orgnum;
    private String industry;
    private String actualCapital;
    private String regGov;
    private String managementPeriod;
    private String companyProfile;
    private String managementSt;
    private String approvedTime;
    private String creditCd;
}
