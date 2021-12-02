package com.github.kabal163.javakabala.lecture9.auto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Bmw extends Car {

    protected Bmw() {
    }

    private String version;
}
