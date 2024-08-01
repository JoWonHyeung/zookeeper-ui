package com.spring.zkui.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ZookeeperController {

    @GetMapping("/api/zkui/ping")
    @ResponseStatus(HttpStatus.OK)
    public String ping(){
        log.info("ping");
        return "pong";
    }

}
