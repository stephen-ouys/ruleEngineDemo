package cn.stephen.demo.controller;

import cn.stephen.demo.service.DroolsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * </p>
 *
 * @author ouyangsheng
 * @date 2022-01-01
 **/
@RestController
@RequestMapping("drools")
public class DroolsController {
    @Autowired
    private DroolsService droolsService;

    @RequestMapping("fire")
    public String fire(){
        droolsService.fireRules();
        return "OK";
    }
}
