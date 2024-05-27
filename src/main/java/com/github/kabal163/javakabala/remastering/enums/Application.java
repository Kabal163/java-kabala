package com.github.kabal163.javakabala.remastering.enums;

public class Application {

    public static void enumUsage(String[] args) {
        BadSolarSystem badSolarSystem = new BadSolarSystem();
        badSolarSystem.addPlanet("Солнце");

        GoodSolarSystem goodSolarSystem = new GoodSolarSystem();
        goodSolarSystem.addPlanet(Planet.EARTH);
    }

    public static void enumSvString(String[] args) {
        String stringMercury = Planets.MERCURY;
        // vs
        Planet enumMercury = Planet.MERCURY;
        stringMercury = enumMercury.getValue();

        enumMercury.print();
    }
}
