package com.github.kabal163.javakabala.old.lecture9.validation;

public interface Validator<T> {

    boolean isValid(T value);
}
