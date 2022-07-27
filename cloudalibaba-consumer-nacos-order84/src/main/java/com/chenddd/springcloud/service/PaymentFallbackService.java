package com.chenddd.springcloud.service;

import com.chenddd.springcloud.common.CommonResult;
import com.chenddd.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * Author: chenddd
 * Date: 2022/7/23 16:20
 * FileName: PaymentFallbackService
 * Description:
 */
@Component
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
