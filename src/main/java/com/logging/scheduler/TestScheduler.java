package com.logging.scheduler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TestScheduler {


    @Scheduled(fixedDelay = 30000)
    public void test(){

        log.trace("hello trace scheduler");
        log.info("hello info scheduler");
        log.debug("hello debug scheduler");
        log.warn("hello warn scheduler");
        log.error("hello error scheduler");
    }

}