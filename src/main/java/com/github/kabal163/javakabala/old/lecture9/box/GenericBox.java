package com.github.kabal163.javakabala.old.lecture9.box;

/**
 * Пример параметризованного класса
 *
 * @param <T> - тип значения, которое хранятся в данной коробке
 */
public class GenericBox<T> {

    private T value;

    public void put(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
