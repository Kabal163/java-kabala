package com.github.kabal163.javakabala.lecture6.animal;

public class Fish extends Animal {

    public Fish(int age) {
        super(age);
    }

    @Override
    public void die() {
        System.out.println("Молча выпускает последний пузырь...");
    }
}
