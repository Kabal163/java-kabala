package com.github.kabal163.javakabala.remastering.enums;

public class GoodSolarSystem {

    private int size = 0;
    private Planet[] planets = new Planet[8];

    public void addPlanet(Planet planet) {
        planets[size++] = planet;
    }
}
