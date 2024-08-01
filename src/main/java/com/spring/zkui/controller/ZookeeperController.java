package com.spring.zkui.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZookeeperController {

    @GetMapping("/api/zkui/ping")
    @ResponseStatus(HttpStatus.OK)
    public String ping(){
        return "pong";
    }

}
