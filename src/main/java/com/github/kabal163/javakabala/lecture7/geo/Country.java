package com.github.kabal163.javakabala.lecture7.geo;

import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

@Getter
public class Country {

    private String name;

    /**
     * Площадь страны в квадратных км.
     */
    private int area;

    /**
     * Численной населения
     */
    private int population;

    private Set<City> cities;

    public Country(String name) {
        this.name = name;
        this.cities = new HashSet<>();
    }

    public Country(String name,
                   Set<City> cities) {
        this.name = name;
        this.cities = cities;
    }

    public void addCity(City city) {
        this.cities.add(city);
    }

    public void removeCity(City city) {
        this.cities.remove(city);
    }

    public int getArea() {
        return area;
    }
}
