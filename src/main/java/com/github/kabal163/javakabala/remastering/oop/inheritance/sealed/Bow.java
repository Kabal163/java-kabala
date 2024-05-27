package com.github.kabal163.javakabala.remastering.oop.inheritance.sealed;

public final class Bow extends Weapon {

    private int distance;

    public Bow(int damage, int level, int distance) {
        super(damage, level);
        this.distance = distance;
    }

    // other methods
    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
