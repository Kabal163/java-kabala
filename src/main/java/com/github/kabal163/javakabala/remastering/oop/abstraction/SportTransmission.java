package com.github.kabal163.javakabala.remastering.oop.abstraction;

import java.util.ArrayList;
import java.util.List;

public class SportTransmission implements Transmission {

    private static final String EDGE_GEAR_MSG = "Невозможно %s передачу, текущая передача является крайней%n";
    private static final String GEAR_CHANGED_MSG = "Передача %s. Новая: %s%n";

    private final List<TransmissionObserver> observers;
    private Gear currentGear;

    public SportTransmission() {
        this.observers = new ArrayList<>();
        neutralGear();
    }

    @Override
    public Gear currentGear() {
        return currentGear;
    }

    @Override
    public void gearUp() {
        if (currentGear == Gear.SIXTH) {
            System.out.printf(EDGE_GEAR_MSG, "увеличить");
        }
        currentGear = Gear.values()[currentGear.ordinal() + 1];
        notifyObservers();
        System.out.printf(GEAR_CHANGED_MSG, "повышена", currentGear);
    }

    @Override
    public void gearDown() {
        if (currentGear == Gear.NEUTRAL || currentGear == Gear.REVERSE) {
            System.out.printf(EDGE_GEAR_MSG, "уменьшить");
        }
        currentGear = Gear.values()[currentGear.ordinal() - 1];
        notifyObservers();
        System.out.printf(GEAR_CHANGED_MSG, "понижена", currentGear);
    }

    @Override
    public void neutralGear() {
        currentGear = Gear.NEUTRAL;
        notifyObservers();
    }

    @Override
    public void reverseGear() {
        assertCurrentGearIsNeutral();
        currentGear = Gear.REVERSE;
        notifyObservers();
    }

    void subscribe(TransmissionObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers() {
        observers.forEach(observer -> observer.gearChanged(new GearChangedEvent(currentGear)));
    }

    private void assertCurrentGearIsNeutral() {
        if (Gear.NEUTRAL != currentGear) {
            throw new IllegalStateException("Задняя передача включается только из нейтральной");
        }
    }
}
