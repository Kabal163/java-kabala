package com.github.kabal163.javakabala.old.lecture4.auto;

import lombok.Getter;
import lombok.Setter;

import javax.annotation.Nonnull;

@Getter
@Setter
public class Mazda extends Car {

    public static String SIGNAL;
    private String signal;

    @Override
    @Nonnull
    protected String getModel() {
        return "Mazda";
    }
}
