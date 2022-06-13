package com.chenddd.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * Author: chenddd
 * Date: 2022/6/7 14:22
 * FileName: PaymentHystrixServiceImpl
 * Description:
 */
@Component
public class PaymentHystrixServiceImpl implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "333333333333333333333333333333";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "44444444444444444444444444";
    }
}
