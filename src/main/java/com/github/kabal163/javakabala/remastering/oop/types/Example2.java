package com.github.kabal163.javakabala.remastering.oop.types;

/**
 * @author Dmitriy Kanaev
 */
public class Example2 {

    public static void main(String[] args) {
        Object dog = new Dog("Шарик", 3, Colors.BLACK);
        Cat cat = new Cat("Барсик", 2, Colors.WHITE);

        // Опа, опа, опапа - а вот так уже можно
        // А все потому, что наша с вами переменная dog
        // теперь имеет тип Object - который неявно является
        // родительским для абсолютно всех типов в Java
        dog = cat;

        // Но есть одно но - работать мы с этой переменой
        // можем только как с Object, а не как с Dog. Т.е.
        // нам не доступны методы и переменные, которые есть
        // у собаки
//        dog.
    }
}
