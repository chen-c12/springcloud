package com.chenddd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


/**
 * Author: chenddd
 * Date: 2022/6/9 11:00
 * FileName: HystrixDashboardMain9002
 * Description:
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9002 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardMain9002.class, args);
    }
}
