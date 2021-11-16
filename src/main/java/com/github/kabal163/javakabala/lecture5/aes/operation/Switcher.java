package com.github.kabal163.javakabala.lecture5.aes.operation;

import com.github.kabal163.javakabala.lecture5.aes.mblock.Active;

/**
 * Оперативник, который умеет включать / выключать
 * реактор
 */
public class Switcher {

    public void turnOn(Active managementBlock) {
        managementBlock.startReactor();
    }

    public void turnOff(Active managementBlock) {
        managementBlock.stopReactor();
    }
}
