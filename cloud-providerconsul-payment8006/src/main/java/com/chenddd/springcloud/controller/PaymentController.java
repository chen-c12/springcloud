package com.chenddd.springcloud.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Author: chenddd
 * Date: 2022/5/31 14:43
 * FileName: PaymentController
 * Description:
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/consul")
    public String paymentconsul(){
        return "springclouf with consul: "+serverPort+"\t"+ UUID.randomUUID().toString();
    }
}
