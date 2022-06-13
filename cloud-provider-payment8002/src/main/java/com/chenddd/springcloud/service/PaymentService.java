package com.chenddd.springcloud.service;

import com.chenddd.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * Author: chenddd
 * Date: 2022/5/25 21:25
 * FileName: PaymentService
 * Description:
 */
public interface PaymentService {

    public int crate(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
