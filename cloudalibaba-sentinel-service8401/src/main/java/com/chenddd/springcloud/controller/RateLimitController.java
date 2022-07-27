package com.chenddd.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.chenddd.springcloud.common.CommonResult;
import com.chenddd.springcloud.entities.Payment;
import com.chenddd.springcloud.myHandler.CustomerBlockHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: chenddd
 * Date: 2022/7/18 15:25
 * FileName: RateLimitController
 * Description:
 */
@RestController
public class RateLimitController {
    @GetMapping("/byResource")
    @SentinelResource(value = "byResource",blockHandler = "handleException")
    public CommonResult byResource(){
        return new CommonResult(200,"按资源名称限流测试",new Payment(2022L,"serial001"));
    }

    public CommonResult handleException(BlockException exception){
        return new CommonResult(444,exception.getClass().getCanonicalName()+"\t服务不可用");
    }

    @GetMapping("/rateLimit/byUrl")
    @SentinelResource(value = "byUrl")
    public CommonResult byUrl(){
        return new CommonResult(200,"按url限流测试ok",new Payment(2022L,"serial002"));
    }

    @GetMapping("/rateLimit/customer")
    @SentinelResource(value = "customer",blockHandlerClass = CustomerBlockHandler.class,blockHandler = "handlerException2")
    public CommonResult customer(){
        return new CommonResult(200,"1111111111ok",new Payment(2022L,"serial003"));
    }
}
