package com.github.kabal163.javakabala.lecture5.aes.mblock;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter(AccessLevel.PROTECTED)
public class ManagementBlock implements Active, Diagnosable, PowerChangeable {

    private static final int MAX_POWER = 1000;
    private int currentPower;
    private boolean active;

    public void startReactor() {
        this.active = true;
        this.currentPower = 500;
        System.out.println("Реактор стартовал");
    }

    public void stopReactor() {
        this.active = false;
        this.currentPower = 0;
        System.out.println("Реактор остановлен");
    }

    public void startDiagnostic() {
        System.out.println("Начало диагностики \nДиагностика прошла успешно");
    }

    public void upPower() {
        if (!active) {
            System.out.println("Реактор не включен, ничего не поменялось...");
            return;
        }
        this.currentPower += 10;
        System.out.println("Мощность реактора увеличена. Текущая мощность: " + currentPower);
    }

    public void downPower() {
        if (!active) {
            System.out.println("Реактор не включен, ничего не поменялось...");
            return;
        }
        this.currentPower -= 10;
        System.out.println("Мощность реактора уменьшена. Текущая мощность: " + currentPower);
    }
}
