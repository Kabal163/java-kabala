package com.github.kabal163.javakabala.old.lecture4.animal;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void die() {
        System.out.println("Собачке плохо...");
    }
}
