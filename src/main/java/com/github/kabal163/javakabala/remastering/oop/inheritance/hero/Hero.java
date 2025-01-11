package com.github.kabal163.javakabala.remastering.oop.inheritance.hero;

public class Hero {

    private String name;
    private int health;
    private int power;
    private int armor;
    private int level;

    public Hero(String name, int health, int power, int armor, int level) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.armor = armor;
        this.level = level;
    }

    /**
     * Перенесли метод takeDamage в родительский класс
     */
    public void takeDamage(int damage) {
        health -= damage;
    }

    /**
     * Также перенесли метод атаки в родительский класс.
     * Важно! Наносим урон через метод {@link #takeDamage(int)},
     * т.к. его механика может отличиться от одного героя к другому
     *
     * @param hero герой, которого атакует текущий
     */
    public void attack(Hero hero) {
        hero.takeDamage(getPower());
    }

    // setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
