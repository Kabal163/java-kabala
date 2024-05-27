package com.github.kabal163.javakabala.old.lecture10;

public class JoinExample {

    static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            for (int i = 0; i < 1_000_000; i++) {
                count++;
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        synchronized (JoinExample.class) {
            thread.join();
        }

        System.out.println(count);
    }
}
