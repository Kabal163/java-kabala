package com.github.kabal163.javakabala.remastering.oop.abstraction;

public class Application {

    public static void main(String[] args) {
        Car bmw = buildBmw();
        Driver driver = new Driver();

        driver.driveMeToWork(bmw);
    }

    private static Car buildBmw() {
        SportTransmission transmission = new SportTransmission();
        SportEngine engine = new SportEngine();
        transmission.subscribe(engine);

        return new Bmw(engine, transmission);
    }
}
