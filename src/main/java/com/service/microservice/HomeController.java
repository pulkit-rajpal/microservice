package com.service.microservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Value("${spring.application.name}")
    private String appName ;


    @RequestMapping("/")
    public String index() {
        System.out.println(appName + " is running");
        return "index.html";
    }
}
