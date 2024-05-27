package com.github.kabal163.javakabala.old.lecture4.auto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Driver {

    private String name;

    public void work(Car car) {
        System.out.println("Я готов к работе!");
        car.start();
        car.run();
    }
}
