package com.github.kabal163.javakabala.remastering.oop.incapsulation.invariant;

public class BadAccount {

    public double balance;
    public double hold;

    public void deposit(double amount) {
        assertAmountIsPositive(amount);

        balance += amount;
    }

    public void hold(double amount) {
        assertAmountIsPositive(amount);
        assertBalanceIsSufficient(amount);

        balance -= amount;
        hold += amount;
    }

    private void assertAmountIsPositive(double amount) {}
    private void assertBalanceIsSufficient(double balance) {}
}
