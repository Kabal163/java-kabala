package com.github.kabal163.javakabala.lecture9.calculator;

public class SimpleCalculator {

    public static <T extends Number> Number calc(T num1, T num2) {
        return num1.intValue() + num2.intValue();
    }
}
