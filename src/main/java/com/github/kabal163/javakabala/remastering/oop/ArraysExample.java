package com.github.kabal163.javakabala.remastering.oop;

import java.util.Arrays;

/**
 * @author Dmitriy Kanaev
 */
public class ArraysExample {

    public static void main(String[] args) {
        Object[][] names = new Object[][]{
            {"Василий", "Иван", "Олег"},
            {"Ольга", "Маша", "Света"},
            {"Bart", "Ben", "Mike"}
        };

        names[1][2] = "Барбара";

        System.out.printf("Наши имена: %s%n", Arrays.deepToString(names));
    }
}
