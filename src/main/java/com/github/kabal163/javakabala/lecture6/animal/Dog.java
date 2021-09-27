package com.github.kabal163.javakabala.lecture6.animal;

public class Dog extends Animal {

    public Dog(int age) {
        super(age);
    }

    @Override
    public void die() {
        System.out.println("Плохо себя чувствует... скулит...");
    }
}
