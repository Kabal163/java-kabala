package com.github.kabal163.javakabala.lecture5.aes.operation;

import com.github.kabal163.javakabala.lecture5.aes.mblock.PowerChangeable;

/**
 * Оперативник, который умеет менять мощность
 * реактора
 */
public class PowerChanger {

    public void turnUp(PowerChangeable managementBlock) {
        managementBlock.upPower();
    }

    public void turnDown(PowerChangeable managementBlock) {
        managementBlock.downPower();
    }
}
