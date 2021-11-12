package com.github.kabal163.javakabala.lecture4;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Car {

    private String model;
    private String color;
    private boolean started;
    private Engine engine;

    public Car(Engine engine) {
        if (engine == null) {
            throw new IllegalArgumentException("У машины должен быть двигатель");
        }
        this.engine = engine;
    }

    public Car(String model,
               String color,
               boolean started,
               Engine engine) {
        this.model = model;
        this.color = color;
        this.started = started;
        this.engine = engine;
    }

    public void start() {
        started = true;
        System.out.println(model + " завелась");
    }

    public void tearDown() {
        started = false;
        System.out.println(model + " заглушена");
    }

    public void run() {
        if (!isStarted()) {
            throw new IllegalStateException(model + " не заведена!");
        }
        System.out.println(model + " поехала");
    }
}
