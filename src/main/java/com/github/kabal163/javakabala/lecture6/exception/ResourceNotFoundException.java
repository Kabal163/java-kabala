package com.github.kabal163.javakabala.lecture6.exception;

/**
 * Это пример непроверяемого исключения.
 * Все искелючения, которые унаследованы от RuntimeException
 * являются непроверяемыми
 */
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
