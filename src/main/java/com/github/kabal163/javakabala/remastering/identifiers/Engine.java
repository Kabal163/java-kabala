package com.github.kabal163.javakabala.remastering.identifiers;

/**
 * @author Dmitriy Kanaev
 */
public class Engine {

    boolean v8 = false;

    /**
     * Пример того, что можно создавать в методах переменные (локальные)
     * с таким же названием, которое уже есть у переменных на
     * уровне класса.
     * Если в методе попытаться обратиться к переменной v8,
     * то по умолчинию он будет использовать переменную, которая
     * объявлена в методе (локальная). Чтобы обратиться к перменной, которая
     * объявлена на уровне класса, нужно использовать ключевое
     * слово {@code this}
     */
    void stop() {
        boolean v8 = true;
        System.out.printf("Значение локальной переменной %s%n", v8);
        System.out.printf("Тип глобальной переменной %s%n", this.v8);
    }

    /**
     * Пример того, что нельзя задавать две переменных с одинаковым
     * названием в пределах одной области видимости
     */
    void start() {
//        int gasTankVolumeL = 40;
//        int gasTankVolumeL = 50;
    }
}
