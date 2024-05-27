package com.github.kabal163.javakabala.old.lecture4.auto;

import com.fasterxml.jackson.core.JsonProcessingException;

public class DriverTest {

    public static void main(String[] args) throws JsonProcessingException {
        Bmw bmw = new Bmw();
        bmw.setColor("RED");
        bmw.setVersion(Bmw.Version.M);

        Mazda mazda = new Mazda();
        mazda.setColor("BLACK");
        mazda.setEngine(new Engine());
        mazda.setSignal("pb1");

        Mercedes mercedes = new Mercedes();
        mercedes.setColor("WHITE");
        mercedes.setEngine(new Engine());

        Driver driver = new Driver();

        driver.work(bmw);
        driver.work(mazda);
        driver.work(mercedes);
    }
}
