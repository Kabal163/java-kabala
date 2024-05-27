package com.github.kabal163.javakabala.remastering.oop.incapsulation.distribution;

public class GoodAccount {

    private double balance;
    private double hold;

    public void hold(double amount) {
        assertAmountIsPositive(amount);
        assertBalanceIsSufficient(amount);

        balance -= amount;
        hold += amount;
    }

    private void assertAmountIsPositive(double amount) {}
    private void assertBalanceIsSufficient(double balance) {}
}
