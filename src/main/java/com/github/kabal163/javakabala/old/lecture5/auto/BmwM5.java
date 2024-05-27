package com.github.kabal163.javakabala.old.lecture5.auto;

public class BmwM5 extends Bmw {

    @Override
    public void startEngine() {
        System.out.println("BMW M5 заводится с красной кнопки");
    }

    public void stop() {
        System.out.println("BMW M5 заглохла");
    }
}
