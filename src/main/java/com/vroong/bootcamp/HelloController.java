package com.vroong.bootcamp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {

    ApplicationEventPublisher publisher;

    public HelloController(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    @GetMapping("/event")
    public void event() {
        publisher.publishEvent(new CustomEvent("hello"));
    }

    @EventListener
    public void handle(CustomEvent event) {
        log.info("Event received: {}", event.getValue());
    }
}
