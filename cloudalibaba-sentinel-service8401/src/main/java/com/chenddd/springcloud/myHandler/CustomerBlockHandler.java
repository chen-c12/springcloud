package com.chenddd.springcloud.myHandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.chenddd.springcloud.common.CommonResult;
import com.chenddd.springcloud.entities.Payment;

/**
 * Author: chenddd
 * Date: 2022/7/18 17:31
 * FileName: CustomerBlockHandler
 * Description:
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception){
        return new CommonResult(444,"按照客户自定义",new Payment(2022L,"serial003"));
    }

    public static CommonResult handlerException2(BlockException exception){
        return new CommonResult(444,"按照客户自定义0002",new Payment(2022L,"serial003"));
    }
}
