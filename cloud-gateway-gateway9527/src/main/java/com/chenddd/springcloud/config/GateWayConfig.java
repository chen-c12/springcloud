package com.chenddd.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author: chenddd
 * Date: 2022/6/10 10:48
 * FileName: GateWayConfig
 * Description:
 */
@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder){
        RouteLocatorBuilder.Builder routes = builder.routes();

        routes.route("path_route001",
                r->r.path("/guonei").uri("http://news.baidu.com/guonei"));
        return routes.build();

    }
}
