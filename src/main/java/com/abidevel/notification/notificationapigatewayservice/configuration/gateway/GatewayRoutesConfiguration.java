package com.abidevel.notification.notificationapigatewayservice.configuration.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class GatewayRoutesConfiguration {

    @Bean
    public RouteLocator customRouteLocator (RouteLocatorBuilder builder) {
        log.info("**Loading Bean**");
       return builder.routes()
            .route("notification-preference", r -> r
                .path("/api/notification/123/preferences/")
                .uri("http://localhost:8081"))
            .route("notfication-formatter", r ->  r
                .path("/api/notification/template/**")
                .uri("http://localhost:8082"))
            .route("notification-communication", r -> r
                .path("/api/generate-notification/**")
                .uri("http://localhost:8083"))
            .route("notification-gateway", r -> r
                .path("/api/notifications/**")
                .uri("http://localhost:8084"))
            .build();   
    }
    
}
