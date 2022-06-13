package com.chenddd.springcloud.service;

import com.chenddd.springcloud.common.CommonResult;
import com.chenddd.springcloud.entities.Payment;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Author: chenddd
 * Date: 2022/6/1 14:33
 * FileName: PaymentFeginService
 * Description:
 */
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeginService {

    @GetMapping("/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping("/payment/feign/timeout")
    String paymentFeignTimeOut();
}
