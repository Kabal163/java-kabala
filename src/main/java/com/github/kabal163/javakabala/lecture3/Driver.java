package com.github.kabal163.javakabala.lecture3;

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

    public void enjoy(Bicycle bicycle) {
        System.out.println("Наслаждаюсь жизнью");
        bicycle.run();
    }
}
