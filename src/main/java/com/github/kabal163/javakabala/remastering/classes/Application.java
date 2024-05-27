package com.github.kabal163.javakabala.remastering.classes;

public class Application {

    public static void main(String[] args) {
        RegularClass regularClass = new RegularClass();

        // Вызывающий код даже не будет знать, с каким реально классом он работает
        // Здесь это просто интерфейс Executor - а как он там реализован, черт его знает
        RegularClass.Executor executor = regularClass.localClass();
        executor.execute();
    }
}
