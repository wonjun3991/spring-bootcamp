package com.vroong.bootcamp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
public class HelloController {
    @PostMapping("/customers")
    public Customer customer(@RequestBody @Valid Customer dto) {
        dto.setAge(dto.getAge() + 1);
        return dto;
    }
}
