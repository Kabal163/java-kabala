package com.github.kabal163.javakabala.remastering.oop.inheritance.sealed;

public sealed class Weapon permits Sword, Bow {

    private int damage;
    private int level;

    public Weapon(int damage, int level) {
        this.damage = damage;
        this.level = level;
    }

    // other methods
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
