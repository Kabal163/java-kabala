package com.github.kabal163.javakabala.remastering.oop.incapsulation.invariant;

/**
 * Пример того, как нарушение инкапсуляции приводит к
 * некорректному инварианту и нарушению целостности данных.
 */
public class Application {

    public static void main(String[] args) {
        BadAccount account = new BadAccount();

        account.deposit(1000);
        account.hold(500);

        account.hold = 10_000;
        account.balance = -1_000_000;
    }
}
