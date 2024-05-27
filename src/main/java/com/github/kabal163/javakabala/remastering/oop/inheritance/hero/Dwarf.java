package com.github.kabal163.javakabala.remastering.oop.inheritance.hero;


public class Dwarf extends Hero {

    /**
     * Значение от 0 до 1. Например, 0.3, что равносильно 30%
     */
    private double blockChance;

    public Dwarf(String name, int health, int power, int armor, int level, double blockChance) {
        super(name, health, power, armor, level);
        this.blockChance = blockChance;
    }

    public void attack(Orc enemy) {
        enemy.takeDamage(getPower());
    }

    public void attack(Elf enemy) {
        enemy.takeDamage(getPower());
    }

    @Override
    public void takeDamage(int damage) {
        // получаем значение от 1 до 100
        double blockAttempt = (System.currentTimeMillis() % 100) + 1;

        if (blockAttempt <= (blockChance * 100)) {
            System.out.println("Хаха, не попал!");
        } else {
            super.takeDamage(damage);
        }
    }
}
