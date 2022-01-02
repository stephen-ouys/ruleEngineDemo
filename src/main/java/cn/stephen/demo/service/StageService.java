package cn.stephen.demo.service;

import cn.stephen.demo.model.dto.RecvInfoDTO;
import cn.stephen.demo.model.entity.Stage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  StageService
 * </p>
 *
 * @author ouyangsheng
 * @date 2022-01-02
 **/
@Slf4j
@Service
public class StageService implements DroolsGlobal {
    /**
     * 演示drools调用Spring容器中的Bean方法
     * @param stageId
     * @return
     */
    public Stage getById(String stageId){
        Stage stage = new Stage();
        stage.setMaxLoanMoney(new BigDecimal("5000000"));
        stage.setMaxLoanDays(300);
        stage.setMaxFinancePer(new BigDecimal(0.9));
        return stage;
    }
}
