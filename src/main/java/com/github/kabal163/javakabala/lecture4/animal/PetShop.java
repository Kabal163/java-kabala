package com.github.kabal163.javakabala.lecture4.animal;

import java.util.Random;

public class PetShop {
    private static final Random RANDOM = new Random();

    /**
     * Совершает покупку животного "в слепую".
     * Мы не знаем, какое животное покупаем.
     *
     * @return какое-то животное
     */
    public Animal buyBlindly() {
        switch (RANDOM.nextInt(2)) {
            case 0: return buyDog();
            case 1: return buyCat();
        }
        return buyDog();
    }

    public Dog buyDog() {
        return new Dog("Шарик"); // по умолчанию в магазине животных всех собак называют Шарик
    }

    public Cat buyCat() {
        return new Cat("Мурзик"); // по умолчанию в магазине животных всех собак называют Мурзик
    }

    public void returnAnimal(Animal animal) {
        System.out.println("Бессердечное животное... как ты можешь возвращать это милое создание...");
        System.out.println("Он же дресированный! Ну ка, " + animal.getName() + "... голос!");
        animal.die();

        System.out.println("Кажется, оно откинулось...");
    }
}
