package com.logging.web.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    @GetMapping
    public String test(){

        log.trace("hello trace controller");
        log.info("hello info controller");
        log.debug("hello debug controller");
        log.warn("hello warn controller");
        log.error("hello error controller");

        return "hello";
    }
}

