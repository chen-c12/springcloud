package com.chenddd.springcloud.dao;

import com.chenddd.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Author: chenddd
 * Date: 2022/5/25 20:59
 * FileName: PaymentDao
 * Description:
 */
@Mapper
public interface PaymentDao {

    public int crate(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
