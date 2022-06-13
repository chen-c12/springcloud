package com.chenddd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * Author: chenddd
 * Date: 2022/6/1 14:29
 * FileName: OrderFeginMain8088
 * Description:
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeginMain8088 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeginMain8088.class, args);
    }
}
