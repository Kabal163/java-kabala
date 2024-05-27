package com.github.kabal163.javakabala.old.lecture5.animal;

public class Dog extends Animal {

    public Dog(int age) {
        super(age);
    }

    @Override
    public void die() {
        System.out.println("Плохо себя чувствует... скулит...");
    }
}
