package com.github.kabal163.javakabala.lecture5.animal;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Гав Гав");
    }
}
