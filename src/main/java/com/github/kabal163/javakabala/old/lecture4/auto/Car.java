package com.github.kabal163.javakabala.old.lecture4.auto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.annotation.Nonnull;

@Getter
@Setter
@ToString
public abstract class Car {

    private String color;
    private boolean started;
    private Engine engine;

    public void start() {
        started = true;
        System.out.println(getModel().toUpperCase() + " завелась");
    }

    public void tearDown() {
        started = false;
        System.out.println(getModel().toUpperCase() + " заглушена");
    }

    public void run() {
        if (!isStarted()) {
            throw new IllegalStateException(getModel().toUpperCase() + " не заведена!");
        }
        System.out.println(getModel().toUpperCase() + " поехала");
    }

    @Nonnull
    protected abstract String getModel();
}
