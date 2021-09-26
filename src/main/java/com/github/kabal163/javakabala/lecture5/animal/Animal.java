package com.github.kabal163.javakabala.lecture5.animal;

/**
 * Базовый класс для всех животных
 * Обратите внимание, что все public и protected
 * поля класса и методы будут доступны дочерним классам
 */
public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    /**
     * Каждое животное должно реализовать этот метод
     */
    public abstract void makeSound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
