package com.github.kabal163.javakabala.lecture9.validation;

public interface Validator<T> {

    boolean isValid(T value);
}
