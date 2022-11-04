package com.vroong.bootcamp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    CustomProperties customProperties;

    @Value("${foo.bar}")
    String value;

    @GetMapping("/properties")
    public String properties() {
        return value;
    }

    @GetMapping("/properties2")
    public CustomProperties properties2() {
        return customProperties;
    }
}
