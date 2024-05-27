package com.github.kabal163.javakabala.old.lecture3;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@ToString
public class Bicycle {

    enum Type {SPORT, NOT_SPORT}

    /**
     * м / сек
     */
    private int maxSpeed;
    private Type type;
    private int amountOfWheels;

    public void run() {
        System.out.println("Велосипед поехал");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bicycle bicycle = (Bicycle) o;
        return this.maxSpeed == bicycle.maxSpeed
                && this.amountOfWheels == bicycle.amountOfWheels
                && this.type == bicycle.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxSpeed, type, amountOfWheels);
    }
}
