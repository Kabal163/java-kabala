package com.github.kabal163.javakabala.remastering.oop.whyobjects;

/**
 * @author Dmitriy Kanaev
 */
public class Car {

    String color;

    String model;

    /**
     * Пример того, как вы можете задавать дефолтные значения,
     * которые затем, могут быть переопределены (например чере
     * сеттер).
     * А теперь подумайте, как сделать так, чтобы в будущем нельзя
     * было изменить значение переменой. Чтобы оно устанавливалось
     * единажды и навсегда?
     */
    int numberOfDoors = 4;
}
