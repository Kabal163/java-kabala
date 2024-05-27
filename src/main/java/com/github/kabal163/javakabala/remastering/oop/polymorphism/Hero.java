package com.github.kabal163.javakabala.remastering.oop.polymorphism;

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

    public void takeDamage(int damage) {
        health -= damage;
    }

    public void attack(Hero enemy) {
        enemy.takeDamage(getPower());
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
