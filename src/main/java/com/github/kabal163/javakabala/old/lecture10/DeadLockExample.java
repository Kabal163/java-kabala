package com.github.kabal163.javakabala.old.lecture10;

/**
 * Проблема deadlock в том, что мониторы берутся
 * не в разной последовательности у разных потоков.
 * Для того, чтобы этого не произошло, поледовательность
 * взятия мониторов и снятия должна быть одинаковой для
 * всех потоков.
 */
public class DeadLockExample {

    public static void main(String[] args) {
        String account1 = "1";
        String account2 = "2";

        Runnable runnable1 = () -> {
            try {
                transferMoney(account1, account2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable runnable2 = () -> {
            try {
                transferMoney(account2, account1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        new Thread(runnable1).start();
        new Thread(runnable2).start();
    }

    private static void transferMoney(String account1, String account2) throws InterruptedException {
        int i = account1.compareTo(account2);
        if (i == 0) {
            return;
        }
        String ac1 = i < 0 ? account1 : account2;
        String ac2 = i > 0 ? account1 : account2;
        synchronized (ac1) {
            Thread.sleep(1000);
            synchronized (ac2) {
                System.out.println("Перевожу деньги...");
            }
        }
    }
}
