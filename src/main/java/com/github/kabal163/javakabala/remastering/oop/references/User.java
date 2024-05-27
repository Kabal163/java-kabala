package com.github.kabal163.javakabala.remastering.oop.references;

/**
 * @author Dmitriy Kanaev
 */
public class User {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
            "name='" + name + '\'' +
            '}';
    }
}
