package com.github.kabal163.javakabala.lecture5.aes.mblock;

public class OldManagementBlock implements Active, PowerChangeable {

    private static final int MAX_POWER = 500;
    private int currentPower;
    private boolean active;

    public void startReactor() {
        this.active = true;
        this.currentPower = 250;
        System.out.println("Реактор стартовал");
    }

    public void stopReactor() {
        this.active = false;
        this.currentPower = 0;
        System.out.println("Реактор остановлен");
    }

    public void upPower() {
        if (!active) {
            System.out.println("Реактор не включен, ничего не поменялось...");
            return;
        }
        this.currentPower += 5;
        System.out.println("Мощность реактора увеличена. Текущая мощность: " + currentPower);
    }

    public void downPower() {
        if (!active) {
            System.out.println("Реактор не включен, ничего не поменялось...");
            return;
        }
        this.currentPower -= 5;
        System.out.println("Мощность реактора уменьшена. Текущая мощность: " + currentPower);
    }
}
