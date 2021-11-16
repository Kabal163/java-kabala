package com.github.kabal163.javakabala.lecture5.aes;

import com.github.kabal163.javakabala.lecture5.aes.mblock.ImprovedManagementBlock;
import com.github.kabal163.javakabala.lecture5.aes.mblock.ManagementBlock;
import com.github.kabal163.javakabala.lecture5.aes.mblock.OldManagementBlock;
import com.github.kabal163.javakabala.lecture5.aes.operation.DiagnosticManager;
import com.github.kabal163.javakabala.lecture5.aes.operation.PowerChanger;
import com.github.kabal163.javakabala.lecture5.aes.operation.Switcher;

public class AesTest {

    public static void main(String[] args) {
        ImprovedManagementBlock improvedManagementBlock = new ImprovedManagementBlock();
        ManagementBlock managementBlock = new ManagementBlock();
        OldManagementBlock oldManagementBlock = new OldManagementBlock();

        Switcher switcher = new Switcher();
        PowerChanger powerChanger = new PowerChanger();
        DiagnosticManager diagnosticManager = new DiagnosticManager();

        switcher.turnOn(managementBlock);
        diagnosticManager.startDiagnostics(managementBlock);
        powerChanger.turnUp(managementBlock);
        powerChanger.turnUp(managementBlock);
        powerChanger.turnUp(managementBlock);
        switcher.turnOff(managementBlock);

        switcher.turnOn(improvedManagementBlock);
        diagnosticManager.startDiagnostics(improvedManagementBlock);
        powerChanger.turnUp(improvedManagementBlock);
        powerChanger.turnUp(improvedManagementBlock);
        powerChanger.turnUp(improvedManagementBlock);
        switcher.turnOff(improvedManagementBlock);

        switcher.turnOn(oldManagementBlock);
        powerChanger.turnUp(oldManagementBlock);
        powerChanger.turnUp(oldManagementBlock);
        powerChanger.turnUp(oldManagementBlock);
        switcher.turnOff(oldManagementBlock);
    }
}
