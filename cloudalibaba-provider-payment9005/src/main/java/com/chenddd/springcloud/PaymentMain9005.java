package com.chenddd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Author: chenddd
 * Date: 2022/7/22 16:40
 * FileName: PaymentMain9005
 * Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9005
{
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9005.class, args);
    }
}
