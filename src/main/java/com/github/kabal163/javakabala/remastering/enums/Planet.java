package com.github.kabal163.javakabala.remastering.enums;

public enum Planet implements Printable {

    MERCURY("mercury"),
    EARTH("earth");

    private final String value;

    Planet(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public void print() {
        System.out.println(getValue());
    }
}
