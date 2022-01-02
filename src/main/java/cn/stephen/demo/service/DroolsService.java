package cn.stephen.demo.service;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.extra.spring.SpringUtil;
import cn.stephen.demo.model.dto.LoanAppDTO;
import cn.stephen.demo.model.dto.RecvInfoDTO;
import cn.stephen.demo.model.enums.BusinessTypeEnum;
import com.drools.core.KieTemplate;
import lombok.extern.slf4j.Slf4j;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;

/**
 * <p>
 *
 * </p>
 *
 * @author ouyangsheng
 * @date 2022-01-01
 **/
@Slf4j
@Service
public class DroolsService  {
    @Autowired
    private KieTemplate kieTemplate;

    public void fireRules(){
        KieSession kieSession = getKieSession();
        LoanAppDTO loanAppDTO = new LoanAppDTO();
        loanAppDTO.setId("1234");
        loanAppDTO.setBusinessType(BusinessTypeEnum.FACTORING);
        loanAppDTO.setRecvTotalAmt(new BigDecimal("50000"));
        loanAppDTO.setSellAmt(new BigDecimal("50000"));
        kieSession.insert(loanAppDTO);
        kieSession.fireAllRules();
    }


    private KieSession getKieSession(){
        KieSession kieSession = kieTemplate.getKieSession("loan.drl","loan-recv.drl","loan-debtor.drl","loan-stage.drl","loan-invoice.drl");
        Map<String, DroolsGlobal> droolsGlobalMap = SpringUtil.getBeansOfType(DroolsGlobal.class);
        if(CollectionUtil.isNotEmpty(droolsGlobalMap)) {
            for (Map.Entry<String,DroolsGlobal> globalEntry: droolsGlobalMap.entrySet()) {
                kieSession.setGlobal(globalEntry.getKey(), globalEntry.getValue());
            }
        }
        return kieSession;
    }

}
