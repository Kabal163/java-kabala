package com.github.kabal163.javakabala.old.lecture9.calculator;

public class SimpleCalculator {

    public static <T extends Number> Number calc(T num1, T num2) {
        return num1.floatValue() + num2.floatValue();
    }
}
