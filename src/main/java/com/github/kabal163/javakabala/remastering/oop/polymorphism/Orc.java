package com.github.kabal163.javakabala.remastering.oop.polymorphism;

public class Orc extends Hero {

    private boolean defenceActive;

    public Orc(String name, int health, int power, int armor, int level) {
        super(name, health, power, armor, level);
        defenceActive = false;
    }

    public void useDefence() {
        defenceActive = true;
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage / getArmor());
        defenceActive = false;
    }
}
