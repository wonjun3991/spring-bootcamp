package com.vroong.bootcamp;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {

    private final HelloService service;

    @GetMapping("/hello-async")
    public ResponseEntity<Void> helloAsync() {
        service.sayHello();
        return ResponseEntity.accepted().build();
    }
}
