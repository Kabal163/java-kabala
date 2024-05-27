package com.github.kabal163.javakabala.old.lecture9;

import com.github.kabal163.javakabala.old.lecture9.auto.BmwBuilder;
import com.github.kabal163.javakabala.old.lecture9.auto.Car;
import com.github.kabal163.javakabala.old.lecture9.auto.CarBuilder;

public class Application {

    public static void main(String[] args) {
        Car car = new CarBuilder.Default()
                .model("BMW")
                .color("RED")
                .build();

        Car build = new BmwBuilder.Default()
                .model("Dfds")
                .color("sdfds")
                .version("sdf")
                .build();
    }
}
