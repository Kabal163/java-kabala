package com.github.kabal163.javakabala.remastering.oop.abstraction;

public class Driver {

    public void driveMeToWork(Car car) {
        car.turnOn();
        car.drive();
        car.drive();
        car.drive();
        car.leftTurnSignal();
        car.drive();
        car.drive();
        car.drive();
        car.rightTurnSignal();
        car.drive();
        car.stop();
        car.stop();
        car.stop();
        car.stop();
        car.stop();
        car.leftTurnSignal();
        car.stop();
        car.stop();
        car.rightTurnSignal();
        car.stop();
        car.stop();
        car.turnOff();
    }
}
