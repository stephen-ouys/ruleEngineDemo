package cn.stephen.demo.service;

import cn.hutool.http.HttpUtil;
import cn.stephen.demo.model.dto.DaasEntInfoDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * <p>
 *  Daas工具
 * </p>
 *
 * @author ouyangsheng
 * @date 2022-01-02
 **/
@Slf4j
@Service
public class DaasService implements DroolsGlobal {

    /**
     * 演示drools调用Spring容器中的Bean方法
     * @param creditCode
     * @return
     */
    public DaasEntInfoDTO getEntInfo(String creditCode){
        System.out.println("模拟调用daas-> creditCode："+ creditCode);
        String body = HttpUtil.createGet("https://www.baidu.com").execute().body();

        DaasEntInfoDTO entInfoDTO = new DaasEntInfoDTO();
        entInfoDTO.setCreditCd("123456");
        entInfoDTO.setCompanyName("张三供应商");
        entInfoDTO.setRegCapital(new BigDecimal("9000000"));
        return entInfoDTO;
    }
}
