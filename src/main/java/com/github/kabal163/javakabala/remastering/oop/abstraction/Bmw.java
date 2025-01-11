package com.github.kabal163.javakabala.remastering.oop.abstraction;

public class Bmw implements Car {

    private static final int RECOMMENDED_ENGINE_RPM = 3000;

    private final Engine engine;
    private final Transmission transmission;

    public Bmw(Engine engine, Transmission transmission) {
        this.engine = engine;
        this.transmission = transmission;
    }

    @Override
    public void turnOn() {
        transmission.neutralGear();
        engine.turnOn();
    }

    @Override
    public void drive() {
        System.out.println("\nВодитель нажимает на педаль газа");
        if (Gear.NEUTRAL.equals(transmission.currentGear())) {
            transmission.gearUp();
        }
        engine.gasUp();

        if (engine.rpm() > RECOMMENDED_ENGINE_RPM) {
            transmission.gearUp();
        }
    }

    @Override
    public void stop() {
        System.out.println("\nВодитель притормаживает");
        if (RECOMMENDED_ENGINE_RPM > engine.rpm()) {
            transmission.gearDown();
        }
        engine.gasDown();
    }

    @Override
    public void leftTurnSignal() {
        System.out.println("Включен левый поворотник");
    }

    @Override
    public void rightTurnSignal() {
        System.out.println("Включен правый поворотник");
    }

    @Override
    public void turnOff() {
        transmission.neutralGear();
        engine.turnOff();
    }
}
