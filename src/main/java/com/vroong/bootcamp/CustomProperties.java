package com.vroong.bootcamp;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "foo")
@Getter
@Setter
public class CustomProperties {
    String bar;
    Baz baz = new Baz();

    @Getter
    @Setter
    class Baz {
        int a;
        int b;
    }
}
