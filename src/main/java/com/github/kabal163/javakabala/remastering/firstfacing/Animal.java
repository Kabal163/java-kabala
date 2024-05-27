package com.github.kabal163.javakabala.remastering.firstfacing;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * Класс (структура), описывающий некое животное.
 * Исходя из определения абстакции, мы с вами выделили
 * ключевые атрибуты животного - возраст и имя.
 *
 * @author Dmitriy Kanaev
 */
public class Animal {

    /**
     * Дефолтная длина имени, если не задана явно
     */
    static final int DEFAULT_NAME_LENGTH = 10;

    /**
     * Как понятно из названия переменной - возраст животного
     */
    int age;

    /**
     * Как ни странно, имя животного
     */
    String name;

    /**
     * Записывает новое значение в переменную {@code name}
     *
     * @param name - новое имя животного
     */
    void setName(String name) {
        this.name = name;
    }

    /**
     * @return текущее имя животного
     */
    String getName() {
        return this.name;
    }

    /**
     * Генерирует новое имя с заданной длиной
     *
     * @param length длина сгенерированного имени
     */
    void generateName(int length) {
        // Ниже также представлена локальная переменная newName
        String newName = RandomStringUtils.randomAlphabetic(length);
        this.name = newName;
        System.out.printf("Новое имя: %s%n", newName);
    }

    /**
     * Генерирует новое имя с дефолтной длиной
     */
    void generateName() {
        this.generateName(DEFAULT_NAME_LENGTH);
    }


    // Как видите, просто переставить параметры местами недостаточно
    // нужно, чтобы отличались именно типы переменных, а не названия.
    // Иначе когда кто-то будет вызывать ваш метод sum(1, 5)
    // компилятор не поймет, какой именно метод нужно вызывать,
    // т.к. оба подходят под заданный вызов
    private int sum(int a, int b) {
        return a + b;
    }

//    private int sum(int b, int a) {
//        return a + b;
//    }
}
