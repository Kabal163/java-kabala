package com.github.kabal163.javakabala.lecture4;

import com.github.kabal163.javakabala.lecture4.animal.Animal;
import com.github.kabal163.javakabala.lecture4.animal.Cat;
import com.github.kabal163.javakabala.lecture4.animal.Dog;
import com.github.kabal163.javakabala.lecture4.animal.PetShop;
import com.github.kabal163.javakabala.lecture4.constructor.SuperChild;
import com.github.kabal163.javakabala.lecture4.furniture.Chair;
import com.github.kabal163.javakabala.lecture4.furniture.Cupboard;

import java.math.BigDecimal;
import java.util.List;

import static com.github.kabal163.javakabala.lecture4.furniture.Cupboard.Door.Type.SLIDING;

/**
 * Лекция №5: Наследование и полиморфизм
 */
public class Application {

    public static void main(String[] args) {
        // пример работы с животными
        PetShop petShop = new PetShop();

        Animal unknownAnimal = petShop.buyBlindly();
        Cat cat = petShop.buyCat();
        Dog dog = petShop.buyDog();

        unknownAnimal.die(); // тут мы не знаем, какое реально животное нам продал магазин, поэтому посмотрим, что же будет в консоле
        cat.die(); // время кошечки пришло
        dog.die(); // время собаки пришло

        System.out.println();
        petShop.returnAnimal(cat);

        // пример работы с мебелью
        System.out.println("\nРабота с мебелью...");

        // т.к. двери устанавливаются на уже окрашенный шкаф, то у дверей и шкафа будет разный цвет

        Cupboard cupboard1 = new Cupboard(
                "RED",
                new BigDecimal("12000"),
                List.of(
                        new Cupboard.Door(
                                SLIDING,
                                false,
                                false,
                                "BLACK"),
                        new Cupboard.Door(
                                SLIDING,
                                false,
                                false,
                                "BLACK")));

        System.out.println(cupboard1);

        // теперь давайте создадим шкаф, потом установим на него двери и покрасим его
        // мы увидим, что двери будут перекрашены вместе со шкафом

        Cupboard cupboard2 = new Cupboard(new BigDecimal("60000"));
        cupboard2.setDoors(List.of(
                new Cupboard.Door(
                        SLIDING,
                        false,
                        false,
                        "BLACK"),
                new Cupboard.Door(
                        SLIDING,
                        false,
                        false,
                        "BLACK")));
        cupboard2.setColor("BLUE");

        System.out.println(cupboard2);

        // мы не можем обращаться к protected и package private методам за пределами пакета
        Chair chair = new Chair("BLACK", new BigDecimal("1000"), true);
//        chair.printColor();
//        chair.printPrice();

        // пример последовательности выполнения конструкторов
        new SuperChild();
    }
}
