package com.github.kabal163.javakabala.lecture7.exception;

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
