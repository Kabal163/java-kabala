package com.github.kabal163.javakabala.remastering.oop.inheritance.sealed;

public final class Sword extends Weapon {

    private boolean twoHanded;

    public Sword(int damage, int level, boolean twoHanded) {
        super(damage, level);
        this.twoHanded = twoHanded;
    }

    // other methods
    public boolean isTwoHanded() {
        return twoHanded;
    }

    public void setTwoHanded(boolean twoHanded) {
        this.twoHanded = twoHanded;
    }
}
