package com.github.kabal163.javakabala.lecture9.wildcard;

public class Source<T> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
