package com.github.kabal163.javakabala.remastering.oop.objects;

/**
 * @author Dmitriy Kanaev
 */
public class Car {

    private String model;
    private Color color;
    private int numberOfWheels;
    private double price;

    public Car(String model, Color color, int numberOfWheels, double price) {
        this.model = model;
        this.color = color;
        this.numberOfWheels = numberOfWheels;
        this.price = price;
    }

    // getters and setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
