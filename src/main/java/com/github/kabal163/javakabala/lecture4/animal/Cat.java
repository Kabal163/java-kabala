package com.github.kabal163.javakabala.lecture4.animal;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void die() {
        System.out.println("Кошечке плохо...");
    }
}
