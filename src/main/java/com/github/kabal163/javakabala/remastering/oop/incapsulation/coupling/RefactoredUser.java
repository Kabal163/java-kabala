package com.github.kabal163.javakabala.remastering.oop.incapsulation.coupling;

import java.time.LocalDate;

public class RefactoredUser {

    private final LocalDate birthDate = LocalDate.of(1983, 8, 21);

    public int age() {
        return LocalDate.now().getYear() - birthDate.getYear();
    }
}
