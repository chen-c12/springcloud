package com.chenddd.springcloud.controller;

import com.chenddd.springcloud.common.CommonResult;
import com.chenddd.springcloud.entities.Payment;
import com.chenddd.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;


/**
 * Author: chenddd
 * Date: 2022/5/25 21:31
 * FileName: PaymentController
 * Description:
 */
@RestController
@RequestMapping(value ="/payment")
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/create")
    public CommonResult create(@RequestBody Payment payment){
        int crate = paymentService.crate(payment);
        log.info("插入结果："+crate);

        if (crate > 0 ){
            return new CommonResult(200,"插入数据库成功,serverPort"+serverPort,crate);
        }else {
            return new CommonResult(444,"插入数据库失败",null);
        }
    }
    @GetMapping("/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment paymentById = paymentService.getPaymentById(id);
        log.info("结果："+paymentById);
        if (paymentById != null){
            return new CommonResult(200,"查询成功,serverPort"+serverPort,paymentById);
        }else {
            return new CommonResult(444,"查询无记录",null);
        }
    }

    @GetMapping("/lb")
    public String paymentLb(){
        return "payment lb"+serverPort;
    }
}
