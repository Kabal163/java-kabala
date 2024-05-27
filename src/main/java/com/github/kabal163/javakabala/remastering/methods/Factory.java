package com.github.kabal163.javakabala.remastering.methods;

/**
 * Пример перегруженного метода.
 * В данном случае мы имеем перегруженный метод {@code createTable}
 *
 * @author Dmitriy Kanaev
 */
public class Factory {

    /**
     * Не принимает параметров
     */
    void createTable() {
        System.out.println("Создаю самый обычный стол");
    }

    /**
     * Принимает на вход один параметр - цвет стола
     *
     * @param color цвет будущего стола
     */
    void createTable(String color) {
        System.out.printf("Создаю стол %s цвета%n", color);
    }

    /**
     * Принимает на вход два параметра - цвет стола и кол-во ножек
     *
     * @param color        цвет будущего стола
     * @param numberOfLegs кол-во ножек
     */
    void createTable(String color, int numberOfLegs) {
        System.out.printf("Создаю стол %s цвета c %d ножками%n", color, numberOfLegs);
    }

    /**
     * Делает все тоже самое, что и {@link #createTable(String, int)}
     * Обратите внимание, что параметры поменяны местами. Это влияет на сигнатуру метода
     */
    void createTable(int numberOfLegs, String color) {
        System.out.println("В целом делаю тоже самое, что и другой такой же метод...");
    }
}
