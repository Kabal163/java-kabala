package com.github.kabal163.javakabala.lecture2.zoo;

import java.util.Objects;

/**
 * Класс описывает животное - кота
 */
public class Cat {

    /**
     * Кличка кота
     */
    private String name;

    /**
     * Возраст кота
     */
    private int age;

    /**
     * Признак лысый. Если {@code true}, значит кот
     * лысый, иначе {@code false}
     */
    private boolean bold;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Обратите внимание, для булевых перменных
     * геттеры имеют префикс is, иногда has
     */
    public boolean isBold() {
        return bold;
    }

    public void setBold(boolean bold) {
        this.bold = bold;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                bold == cat.bold &&
                Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, bold);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", bold=" + bold +
                '}';
    }
}
