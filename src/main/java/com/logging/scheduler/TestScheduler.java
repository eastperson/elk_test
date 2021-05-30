package com.logging.scheduler;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j(topic = "aws_log")
public class TestScheduler {

    private static final Marker CORE_MARKER = MarkerFactory.getMarker("CORE");


    @Scheduled(fixedDelay = 30000)
    public void test(){

        log.trace("hello trace scheduler");
        log.info(CORE_MARKER,"hello aws info scheduler");
        log.debug("hello debug scheduler");
        log.warn("hello warn scheduler");
        log.error("hello error scheduler");
    }

}