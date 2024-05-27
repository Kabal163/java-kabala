package com.github.kabal163.javakabala.remastering.identifiers;

/**
 * Правильное название класса - начинается с заглавной буквы
 *
 * @author Dmitriy Kanaev
 */
public class Computer {

    /**
     * Правильное название - константы называются прописными буквами
     */
    public static final double PI = 3.14;

    /**
     * Неправильно название, т.к. используются строчные буквы
     */
    public static final double pi = 3.14;

    /**
     * Пример правильного названия метода
     */
    void turnOn() {
        System.out.println("Компъютер включился");
    }

    /**
     * Пример НЕправильного названия метода
     * Метод всегда должен начинаться с маленькой буквы
     */
    void TurnOn() {
        //
    }

    /**
     * Такое название тоже допустимо с точки зрения компилятора
     * Но скорее всего ни один человек не пропустит такое на ревью
     */
    void _valid$name4() {
        //
    }


    void turnOff() {
        System.out.println("Компъютер отключился");
    }
}
