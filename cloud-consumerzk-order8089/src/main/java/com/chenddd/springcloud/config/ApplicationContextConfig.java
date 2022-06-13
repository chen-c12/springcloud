package com.chenddd.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Author: chenddd
 * Date: 2022/5/31 10:44
 * FileName: ApplicationContextConfig
 * Description:
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced//负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
