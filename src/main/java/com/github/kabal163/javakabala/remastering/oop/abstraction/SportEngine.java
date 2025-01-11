package com.github.kabal163.javakabala.remastering.oop.abstraction;

public class SportEngine implements Engine, TransmissionObserver {

    public static final int MAX_RPM = 8_000;
    public static final int MIN_RPM = 1_000;
    private static final String RPM_CHANGED_MSG = "Подача газа %s. Текущие обороты двигателя: %d%n";
    private static final int MAX_GAS_INJECTION = 50_000;
    private static final int GAS_CHANGE_STEP = 1200;
    private static final int DEFAULT_GAS_INJECTION = 3_000;

    private int gasInjection;
    private int resistance;
    private boolean isRunning;

    @Override
    public void turnOn() {
        isRunning = true;
        gasInjection = DEFAULT_GAS_INJECTION;
        System.out.printf("Двигатель заведен, обороты: %d%n", rpm());
    }

    @Override
    public void gasUp() {
        assertIsRunning();
        if (gasInjection >= MAX_GAS_INJECTION || rpm() >= MAX_RPM) {
            System.out.println("Двигатель работает на пределе");
            return;
        }
        gasInjection += GAS_CHANGE_STEP;
        System.out.printf(RPM_CHANGED_MSG, "увеличена", rpm());
    }

    @Override
    public void gasDown() {
        assertIsRunning();
        gasInjection = Math.max(gasInjection - GAS_CHANGE_STEP, 0);
        if (rpm() < MIN_RPM) {
            System.out.println("Обороты снизились до недопустимых, двигатель заглох");
            turnOff();
        }
        System.out.printf(RPM_CHANGED_MSG, "уменьшена", rpm());
    }

    @Override
    public void turnOff() {
        isRunning = false;
        gasInjection = 0;
        resistance = 0;
        System.out.println("Двигатель заглушен");
    }

    @Override
    public int rpm() {
        if (resistance == Gear.NEUTRAL.resistance()) {
            return MIN_RPM;
        }
        return gasInjection / resistance;
    }

    @Override
    public void gearChanged(GearChangedEvent event) {
        resistance = event.newGear().resistance();
    }

    private void assertIsRunning() {
        if (!isRunning) {
            throw new IllegalStateException("Двигатель не заведен. Невозможно добавить газ");
        }
    }
}
