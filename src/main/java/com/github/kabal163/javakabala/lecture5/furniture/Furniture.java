package com.github.kabal163.javakabala.lecture5.furniture;

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
