package com.github.kabal163.javakabala.remastering.oop.inheritance.hero;


public class Dwarf extends Hero {

    /**
     * Шанс блокировать атаку. Принимает значение от 0 до 100.
     * Например, 30 равносильно 30%
     */
    private final double blockChance;

    public Dwarf(String name, int health, int power, int armor, int level, double blockChance) {
        super(name, health, power, armor, level);
        assertBetween0And100(blockChance);
        this.blockChance = blockChance;
    }

    @Override
    public void takeDamage(int damage) {
        // получаем значение от 1 до 100
        double blockAttempt = (System.currentTimeMillis() % 100) + 1;

        if (blockChance >= blockAttempt) {
            System.out.println("Ха-ха, не попал!");
        } else {
            super.takeDamage(damage);
        }
    }

    private static void assertBetween0And100(double blockChance) {
        if (blockChance < 0 || blockChance > 100) {
            throw new IllegalArgumentException(
                    "Шанс отразить атаку должен лежать в диапазоне от 0 до 100"
            );
        }
    }
}
