package com.github.kabal163.javakabala.lecture4.auto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.annotation.Nonnull;

@Getter
@Setter
@ToString(callSuper = true)
public class Bmw extends Car {

    enum Version {M, SPORT, DEFAULT}

    /**
     * Размер колес в дюймах
     */
    private int wheelSize;

    private Version version;

    public void useRevers() {
        System.out.println("BMW едет назад");
    }

    @Override
    @Nonnull
    protected String getModel() {
        return "BMW";
    }
}
