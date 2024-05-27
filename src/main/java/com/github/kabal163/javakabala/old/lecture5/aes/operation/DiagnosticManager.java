package com.github.kabal163.javakabala.old.lecture5.aes.operation;

import com.github.kabal163.javakabala.old.lecture5.aes.mblock.Diagnosable;

/**
 * Этот оперативник, умеет производить диагностику
 */
public class DiagnosticManager {

    public void startDiagnostics(Diagnosable managementBlock) {
        managementBlock.startDiagnostic();
    }
}
