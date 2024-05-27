package com.github.kabal163.javakabala.remastering.enums;

public class BadSolarSystem {

    private int size = 0;
    private String[] planets = new String[8];

    public void addPlanet(String planet) {
        planets[size++] = planet;
    }
}
