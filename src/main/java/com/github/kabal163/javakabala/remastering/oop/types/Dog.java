package com.github.kabal163.javakabala.remastering.oop.types;

/**
 * @author Dmitriy Kanaev
 */
public class Dog {

    String name;
    int age;
    String color;
    String position;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.position = Positions.STAY;
    }

    public void sit() {
        position = Positions.SIT;
        System.out.println("Я сижу");
    }

    public void stay() {
        position = Positions.STAY;
        System.out.println("Я стою");
    }

    public void lay() {
        position = Positions.LAY;
        System.out.println("Я лежу");
    }

    public void sayGav() {
        System.out.println("Gav");
    }
}
