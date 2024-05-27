package com.github.kabal163.javakabala.remastering.oop;

/**
 * @author Dmitriy Kanaev
 */
public class StacktraceExample {

    public static void main(String[] args) {
        first();
    }

    static void first() {
        second();
    }

    static void second() {
        third();
    }

    static void third() {
        fourth();
    }

    static void fourth() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            System.out.println(stackTraceElement);
        }
    }
}
