package com.github.kabal163.javakabala.lecture5.furniture;

import com.github.kabal163.javakabala.lecture5.animal.Sofa;

import java.math.BigDecimal;

/**
 * Мебель
 */
public abstract class Furniture {

    /**
     * Цвет мебели
     */
    private String color;

    /**
     * Стоимость мебели
     */
    private BigDecimal price;

    public Furniture(String color, BigDecimal price) {
        this.color = color;
        this.price = price;
    }

    /**
     * Мы видимо protected метод.
     * Его может переопределить любой потомок данного класса,
     * даже если он находится в другом пакете
     *
     * @see Sofa
     */
    protected void printPrice() {
        System.out.println("Стоимость данного иделия: " + price);
    }

    /**
     * А этот метод package private.
     * Он доступен для переопределения наследникам,
     * которые находятся только в этом же пакете.
     */
    void printColor() {
        System.out.println("Цвет изделия иделия: " + price);
    }

    /**
     * Создает мебель с цветом по умолчанию
     */
    public Furniture(BigDecimal price) {
        this.color = "WHITE";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
