package com.github.kabal163.javakabala.lecture7;

import java.io.IOException;

public class FileReader {

    public static byte[] readBytes() throws IOException {
        System.out.println("Начал читать данные из файла...");

        throw new IOException("Ошибка при чтении данных из файла!");
    }
}
