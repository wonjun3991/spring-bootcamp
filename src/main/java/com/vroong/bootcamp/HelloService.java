package com.vroong.bootcamp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class HelloService {
    @Async
    public void sayHello() {
        log.info("Hello, async?");
    }
}
