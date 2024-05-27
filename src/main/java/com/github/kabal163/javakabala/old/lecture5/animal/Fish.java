package com.github.kabal163.javakabala.old.lecture5.animal;

public class Fish extends Animal {

    public Fish(int age) {
        super(age);
    }

    @Override
    public void die() {
        System.out.println("Молча выпускает последний пузырь...");
    }
}
