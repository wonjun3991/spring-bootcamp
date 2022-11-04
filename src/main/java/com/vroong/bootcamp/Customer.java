package com.vroong.bootcamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Customer {
    @NonNull
    private String name;
    private int age;
}
