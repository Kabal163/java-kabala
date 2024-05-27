package com.github.kabal163.javakabala.old.lecture9.box;

public class NonGenericBox {

    private Object value;

    public void put(Object value) {
        this.value = value;
    }

    public Object get() {
        return this.value;
    }
}
