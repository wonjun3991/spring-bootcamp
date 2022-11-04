package com.vroong.bootcamp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ScheduledTask {
    @Scheduled(cron = "*/5 * * * * *")
    public void run() {
        log.info("Scheduled task running...");
    }
}
