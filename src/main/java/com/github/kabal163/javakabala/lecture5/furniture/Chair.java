package com.github.kabal163.javakabala.lecture5.furniture;

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

    public boolean hasBack() {
        return back;
    }

    public void setBack(boolean back) {
        this.back = back;
    }
}
