package com.github.kabal163.javakabala.lecture5.animal;

import com.github.kabal163.javakabala.lecture5.furniture.Furniture;

import java.math.BigDecimal;

/**
 * Этот класс явно находится не в своем пакете.
 * Он должен находиться в пакете
 * {@link com.github.kabal163.javakabala.lecture5.furniture}
 *
 * Давайте посмотрим, как ему удастся унаследовать методы
 * родителя
 */
public class Sofa extends Furniture {

    public Sofa(String color, BigDecimal price) {
        super(color, price);
    }

    /**
     * Успешно переопределили protected метод
     */
    @Override
    protected void printPrice() {
        System.out.println("Цвет дивана: " + getPrice());
    }

//    а вот printColor() мы уже не можем переопределить, т.к.
//    находимся в другом пакете
//    более того, нам впринципе не доступен здесь метод getColor()
//    @Override
//    void printColor() {
//        System.out.println("Цвет стула: " + getColor());
//    }
}
