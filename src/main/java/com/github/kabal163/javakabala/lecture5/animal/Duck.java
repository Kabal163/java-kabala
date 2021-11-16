package com.github.kabal163.javakabala.lecture5.animal;

public class Duck extends Animal {

    public Duck(int age) {
        super(age);
    }

    @Override
    public void die() {
        System.out.println("Падает с неба на землю...");
    }
}
