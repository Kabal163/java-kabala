package com.github.kabal163.javakabala.lecture5.animal;

public class Dog extends Animal {

    public Dog(int age) {
        super(age);
    }

    @Override
    public void die() {
        System.out.println("Плохо себя чувствует... скулит...");
    }
}
