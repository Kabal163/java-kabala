package com.github.kabal163.javakabala.lecture9.calculator;

public class CalcTest {

    public static void main(String[] args) {
        int a = 5;
        float b = 5.5f;
        Number sum = SimpleCalculator.calc(a, b);

        System.out.println(sum);
    }
}
