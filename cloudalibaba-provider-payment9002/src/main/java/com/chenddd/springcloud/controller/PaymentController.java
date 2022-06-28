package com.chenddd.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: chenddd
 * Date: 2022/6/28 15:14
 * FileName: PaymentController
 * Description:
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String port;


    @GetMapping("payment/nacos/{id}")
    public String nacos(@PathVariable("id") Integer id){
        return "nacos registry,server port:"+port+"\t"+id;
    }
}
