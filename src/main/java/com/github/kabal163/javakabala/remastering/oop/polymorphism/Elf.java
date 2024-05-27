package com.github.kabal163.javakabala.remastering.oop.polymorphism;

/**
 * Убрали метод attack в родительский класс {@link Hero}
 */
public class Elf extends Hero {

    public Elf(String name, int health, int power, int armor, int level) {
        super(name, health, power, armor, level);
    }
}
