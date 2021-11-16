package com.github.kabal163.javakabala.lecture5.auto;

import com.github.kabal163.javakabala.lecture4.auto.Engine;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Car implements Startable {

    private String color;
    private boolean started;
    private Engine engine;
}
