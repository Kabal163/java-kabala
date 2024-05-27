package com.github.kabal163.javakabala.remastering.oop.objects;

/**
 * @author Dmitriy Kanaev
 */
public class Example1 {

    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        apple1.setWeight(41);
        apple2.setWeight(56);
        apple3.setWeight(10001);

        System.out.printf("Вес первого яблока: %s%n", apple1.getWeight());
        System.out.printf("Вес второго яблока: %s%n", apple2.getWeight());
        System.out.printf("Вес третьего яблока: %s%n", apple3.getWeight());
    }
}
