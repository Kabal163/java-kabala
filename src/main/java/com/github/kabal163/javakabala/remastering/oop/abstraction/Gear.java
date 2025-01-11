package com.github.kabal163.javakabala.remastering.oop.abstraction;

public enum Gear {

    REVERSE(1), NEUTRAL(Integer.MAX_VALUE), FIRST(1), SECOND(2), THIRD(3), FOURTH(4), FIFTH(5), SIXTH(6);

    Gear(int resistance) {
        this.resistance = resistance;
    }

    private final int resistance;

    public int resistance() {
        return resistance;
    }
}
