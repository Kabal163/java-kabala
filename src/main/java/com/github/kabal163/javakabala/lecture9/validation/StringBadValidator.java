package com.github.kabal163.javakabala.lecture9.validation;

public class StringBadValidator implements BadValidator {

    @Override
    public boolean isValid(Object value) {
        return false;
    }
}
