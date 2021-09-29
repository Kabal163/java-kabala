package com.github.kabal163.javakabala.lecture7.exception;

/**
 * Это проверяемое исключение, которое обязывает вас либо
 * обработать его, либо прокинуть дальше.
 */
public class LoadingException extends Exception {

    public LoadingException(String message) {
        super(message);
    }
}
