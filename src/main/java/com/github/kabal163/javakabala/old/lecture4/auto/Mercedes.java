package com.github.kabal163.javakabala.old.lecture4.auto;

import javax.annotation.Nonnull;

public class Mercedes extends Car {

    @Nonnull
    @Override
    protected String getModel() {
        return "Mercedes";
    }
}
