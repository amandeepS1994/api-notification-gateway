package com.abidevel.notification.notificationapigatewayservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "system/")
public class HealthController {

    @GetMapping("health/")
    public String retrieveSystemHealth() {
        return "UP";
    }
    
}
