package com.github.kabal163.javakabala.remastering.oop.types;

/**
 * @author Dmitriy Kanaev
 */
public class Example1 {

    public static void main(String[] args) {
        Dog dog = new Dog("Шарик", 3, Colors.BLACK);
        Cat cat = new Cat("Барсик", 2, Colors.WHITE);

        // Мы видим, что так сделать нельзя, т.к. эти переменные
        // разного типа. Даже если бы у них было идентичное содержимое,
        // все равно данную операцию делать нельзя
//        dog = cat;

        Dog anotherDog = new Dog("Рэкс", 6, Colors.WHITE);

        // А так сделать можно, т.к. обе переменные одного и того же
        // типа Dog. А это значит, в обеех переменных у нас хранятся
        // собаки (объекты), которые были сделаны из одного и тогоже
        // класса
        dog = anotherDog;
    }
}
