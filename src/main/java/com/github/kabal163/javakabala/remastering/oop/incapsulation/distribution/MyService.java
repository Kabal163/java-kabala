package com.github.kabal163.javakabala.remastering.oop.incapsulation.distribution;

/**
 * Пример нарушения инкапсуляции, когда данные и методы по работе
 * с этими данными находятся в разных классах / пакетах
 */
public class MyService {

    public void hold(double amount, BadAccount account) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма операции должна быть положительной");
        }
        if (amount > account.getBalance()) {
            throw new IllegalArgumentException("Сумма операции не может превышать текущий баланс");
        }
        account.setBalance(account.getBalance() - amount);
        account.setHold(account.getHold() + amount);
    }
}
