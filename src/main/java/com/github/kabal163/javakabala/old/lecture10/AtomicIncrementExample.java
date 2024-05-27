package com.github.kabal163.javakabala.old.lecture10;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIncrementExample {

    private static final AtomicInteger COUNT = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            for (int i = 0; i < 100_000; i++) {
                COUNT.incrementAndGet();
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("Результат равен: " + COUNT);
    }
}
