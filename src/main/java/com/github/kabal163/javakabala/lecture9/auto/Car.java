package com.github.kabal163.javakabala.lecture9.auto;

import lombok.Data;

@Data
public class Car {

    protected Car() {
    }

    private String model;
    private String color;
}
