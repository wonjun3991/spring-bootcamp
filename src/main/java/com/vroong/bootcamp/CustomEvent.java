package com.vroong.bootcamp;
import lombok.Data;

@Data
public class CustomEvent {

    String value;

    public CustomEvent(String value) {
        this.value = value;
    }
}
