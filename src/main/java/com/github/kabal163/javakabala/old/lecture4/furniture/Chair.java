package com.github.kabal163.javakabala.old.lecture4.furniture;

import java.math.BigDecimal;

/**
 * Стул
 */
public class Chair extends Furniture {

    /**
     * Признак, говорящий о том, что стул
     * имеет спинку. Если {@code true}, значит
     * у стула есть спинка, иначе {@code false}
     */
    private boolean back;

    public Chair(String color,
                 BigDecimal price,
                 boolean back) {
        super(color, price);
        this.back = back;
    }

    /**
     * Тут мы без проблем переопределяем protected метод
     */
    @Override
    protected void printPrice() {
        System.out.println("Стоимость стула: " + getPrice());
    }

    /**
     * Точно также мы без проблем переопределяем package private метод
     */
    @Override
    void printColor() {
        System.out.println("Цвет стула: " + getColor());
    }

    public boolean hasBack() {
        return back;
    }

    public void setBack(boolean back) {
        this.back = back;
    }
}
