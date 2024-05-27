package com.github.kabal163.javakabala.old.lecture6.exception;

/**
 * Это проверяемое исключение, которое обязывает вас либо
 * обработать его, либо прокинуть дальше.
 */
public class LoadingException extends Exception {

    public LoadingException(String message) {
        super(message);
    }

    public LoadingException(String message, Throwable cause) {
        super(message, cause);
    }
}
