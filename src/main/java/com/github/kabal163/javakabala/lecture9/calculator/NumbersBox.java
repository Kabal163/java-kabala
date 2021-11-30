package com.github.kabal163.javakabala.lecture9.calculator;

import lombok.Data;

@Data
public class NumbersBox<T extends Number> {

    private T num;

    public boolean isEvent() {
        return num.intValue() % 2 == 0;
    }
}
