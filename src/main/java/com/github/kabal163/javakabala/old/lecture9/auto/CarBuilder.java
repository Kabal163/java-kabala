package com.github.kabal163.javakabala.old.lecture9.auto;

public interface CarBuilder<T extends CarBuilder<T>> {

    Car build();

    T model(String model);

    T color(String color);

    final class Default implements CarBuilder<Default> {
        private Car car = new Car();

        @Override
        public Car build() {
            if (car.getModel() == null) throw new IllegalStateException("Car's model must not be null!");
            if (car.getColor() == null) throw new IllegalStateException("Car's color must not be null!");

            return car;
        }

        @Override
        public Default model(String model) {
            car.setModel(model);
            return this;
        }

        @Override
        public Default color(String color) {
            car.setColor(color);
            return this;
        }
    }
}
