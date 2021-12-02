package com.github.kabal163.javakabala.lecture9.auto;

public interface BmwBuilder extends CarBuilder<BmwBuilder> {

    BmwBuilder version(String version);

    final class Default implements BmwBuilder {

        @Override
        public BmwBuilder version(String version) {
            return this;
        }

        @Override
        public Car build() {
            return null;
        }

        @Override
        public BmwBuilder model(String model) {
            return this;
        }

        @Override
        public BmwBuilder color(String color) {
            return this;
        }
    }
}
