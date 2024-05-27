package com.github.kabal163.javakabala.old.lecture8;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class StreamsWrapperExample {

    /**
     * Пример того, как можно обернуть один поток другим,
     * создав цепочку потоков. Не путать с паттерном chain of responsibility!
     * В данном случае применен паттерн Декоратор (или Wrapper, обёртка)
     *
     * @see <a href=https://refactoring.guru/ru/design-patterns/decorator></a>
     */
    public static void wrapStream() {
        // В файле записано число 2021 в бинарном формате, поэтому открыв файл через редактор, вы увидите кракозябру
        final String filename = "src/main/resources/number.txt";

        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            System.out.println("Число, прочитанное из файла: " + dis.readInt());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
