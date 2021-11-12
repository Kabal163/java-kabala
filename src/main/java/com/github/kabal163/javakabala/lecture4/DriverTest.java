package com.github.kabal163.javakabala.lecture4;

public class DriverTest {

    public static void main(String[] args) {
        Bicycle bicycle1 = new Bicycle();
        bicycle1.setType(Bicycle.Type.SPORT);
        bicycle1.setMaxSpeed(150);
        bicycle1.setAmountOfWheels(4);

        Engine engine = new Engine();
        Car car = new Car(engine);
        car.setModel("BMW");
        car.setColor("Black");

        Car car1 = new Car("Mazda", "Red", false, new Engine());
        car1.setColor("White");

        System.out.println(car1);
    }
}
