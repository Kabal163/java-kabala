package com.github.kabal163.javakabala.remastering.firstfacing;

/**
 * @author Dmitriy Kanaev
 */
public class Owner {

    void callAnimal(Animal animal) {
        System.out.println("%s, ко мне!".formatted(animal.getName()));
    }
}
