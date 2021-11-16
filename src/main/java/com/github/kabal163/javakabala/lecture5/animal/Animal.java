package com.github.kabal163.javakabala.lecture5.animal;

public abstract class Animal {

    /**
     * У всех животных есть возраст
     */
    private int age;

    public Animal(int age) {
        this.age = age;
    }

    /**
     * т.к. все животные умирают, у всех должен
     * быть такой метод
     * Делая метод абстрактным мы заставляем все
     * дочерние классы реализовать его, либо
     * дочерний класс сам должен быть абстрактным
     */
    public abstract void die();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
