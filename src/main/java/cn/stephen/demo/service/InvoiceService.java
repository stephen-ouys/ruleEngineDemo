package cn.stephen.demo.service;

import cn.stephen.demo.model.entity.RecvInvoice;
import cn.stephen.demo.model.entity.Stage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * <p>
 *  InvoiceService
 * </p>
 *
 * @author ouyangsheng
 * @date 2022-01-02
 **/
@Slf4j
@Service
public class InvoiceService implements DroolsGlobal {
    /**
     * 演示drools调用Spring容器中的Bean方法
     * @param recvIds
     * @return
     */
    public List<RecvInvoice> listByRecvIds(Collection<String> recvIds){
        List<RecvInvoice> recvInvoices = new ArrayList<>(3);
        RecvInvoice invoice = new RecvInvoice();
        invoice.setInvoiceCode("123455");
        invoice.setInvoiceNo("654321");
        recvInvoices.add(invoice);
        invoice = new RecvInvoice();
        invoice.setInvoiceCode("123455");
        invoice.setInvoiceNo("654321");
        recvInvoices.add(invoice);
        invoice = new RecvInvoice();
        invoice.setInvoiceCode("555555");
        invoice.setInvoiceNo("333333");
        recvInvoices.add(invoice);
        return recvInvoices;
    }
}
