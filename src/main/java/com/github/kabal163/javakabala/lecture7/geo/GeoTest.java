package com.github.kabal163.javakabala.lecture7.geo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class GeoTest {

    public static void main(String[] args) {
        City city1 = new City("Тольятти");
        City city2 = new City("Москва");
        City city3 = new City("Самара");

        Set<City> cities1 = new HashSet<>();
        cities1.add(city1);
        cities1.add(city2);

        // FIFO
        Queue<City> cities2 = new LinkedList<>();
        cities2.add(city1);
        cities2.add(city2);
        cities2.add(city3);

        System.out.println(cities2.peek());
        System.out.println(cities2);
        System.out.println("\n");
        System.out.println(cities2.poll());
        System.out.println(cities2);

        List<City> cities3 = new ArrayList<>();
        cities3.add(city1);
        cities3.add(city2);
        cities3.add(city3);

        System.out.println("\n");
        System.out.println(cities3.get(0));
        System.out.println(cities3.get(1));
        System.out.println(cities3.get(2));
        System.out.println(cities3);

        Map<Integer, City> cities4 = new HashMap<>();
        cities4.put(1, city1);
        cities4.put(2, city2);
        cities4.put(3, city3);

        System.out.println("\n");
        City city = cities4.get(3);
        System.out.println(city);
    }
}
