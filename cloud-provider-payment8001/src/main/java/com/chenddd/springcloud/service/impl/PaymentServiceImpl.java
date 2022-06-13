package com.chenddd.springcloud.service.impl;

import com.chenddd.springcloud.dao.PaymentDao;
import com.chenddd.springcloud.entities.Payment;
import com.chenddd.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author: chenddd
 * Date: 2022/5/25 21:26
 * FileName: PaymentServiceImpl
 * Description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int crate(Payment payment){
        return paymentDao.crate(payment);
    }

    @Override
    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }

}
