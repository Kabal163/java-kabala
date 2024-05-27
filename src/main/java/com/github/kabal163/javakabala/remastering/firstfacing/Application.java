package com.github.kabal163.javakabala.remastering.firstfacing;

/**
 * @author Dmitriy Kanaev
 */
public class Application {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("Барсик");

        Owner owner = new Owner();
        owner.callAnimal(animal);
    }
}
