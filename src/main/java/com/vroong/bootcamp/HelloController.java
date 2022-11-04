package com.vroong.bootcamp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @PostMapping("/customers")
    public Customer customer(@RequestBody Customer dto){
        dto.setAge(dto.getAge() + 1);
        return dto;
    }
}
