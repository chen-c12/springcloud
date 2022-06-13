package com.chenddd.springcloud.controller;

import com.chenddd.springcloud.common.CommonResult;
import com.chenddd.springcloud.entities.Payment;
import com.chenddd.springcloud.service.PaymentFeginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: chenddd
 * Date: 2022/6/1 14:45
 * FileName: OrderFeignController
 * Description:
 */
@RestController
@Slf4j
public class OrderFeignController {
    @Autowired
    private PaymentFeginService paymentFeginService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeginService.getPaymentById(id);
    }

    @GetMapping("/consumer/payment/timeout")
    public String paymentFeignTimeOut(){
        //openfegin-ribbon,客户端一般默认等待1秒
        return paymentFeginService.paymentFeignTimeOut();
    }
}
