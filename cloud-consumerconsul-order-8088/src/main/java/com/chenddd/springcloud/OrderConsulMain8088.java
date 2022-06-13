package com.chenddd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Author: chenddd
 * Date: 2022/5/31 15:12
 * FileName: OrderConsulMain8088
 * Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain8088 {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsulMain8088.class, args);
    }
}
