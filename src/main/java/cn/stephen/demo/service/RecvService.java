package cn.stephen.demo.service;

import cn.stephen.demo.model.dto.RecvInfoDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  RecvService
 * </p>
 *
 * @author ouyangsheng
 * @date 2022-01-02
 **/
@Slf4j
@Service
public class RecvService implements DroolsGlobal {

    /**
     * 演示drools调用Spring容器中的Bean方法
     * @param loanAppId
     * @return
     */
    public List<RecvInfoDTO> getRecvInfoList(String loanAppId){
        System.out.println("模拟数据库查询-> loanAppId："+ loanAppId);
        List<RecvInfoDTO> result = new ArrayList<>(3);
        RecvInfoDTO recvInfoDTO = new RecvInfoDTO();
        recvInfoDTO.setId("RECV00001");
        recvInfoDTO.setRecvAmt(new BigDecimal("4000"));
        recvInfoDTO.setBuyerEntCreditCode("123456");
        result.add(recvInfoDTO);
        recvInfoDTO = new RecvInfoDTO();
        recvInfoDTO.setId("RECV00002");
        recvInfoDTO.setRecvAmt(new BigDecimal("6000"));
        recvInfoDTO.setBuyerEntCreditCode("123456");
        result.add(recvInfoDTO);
        recvInfoDTO = new RecvInfoDTO();
        recvInfoDTO.setId("RECV00003");
        recvInfoDTO.setRecvAmt(new BigDecimal("2000"));
        recvInfoDTO.setBuyerEntCreditCode("123456");
        result.add(recvInfoDTO);
        return result;
    }
}
