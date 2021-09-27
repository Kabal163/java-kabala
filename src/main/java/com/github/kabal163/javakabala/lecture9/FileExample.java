package com.github.kabal163.javakabala.lecture9;

import java.io.File;
import java.io.IOException;

public class FileExample {

    public static void createFileExample() {
        final String filename = "target/file_example.json";
        System.out.println("");

        File file = new File(filename); // Создаем объект типа File. Это не значит, что на файловой системе он реально что-то создал. Нет, это просто объект

        try {
            boolean succeeded = file.createNewFile();// А вот так мы можем его создать. Возвращает true если файл создан. Если файл уже существовал, вернет false
            System.out.println("Создан новый файл: " + succeeded);
            System.out.println("Название созданного файла: " + file.getName());
            System.out.println("Файл является директорией: " + file.isDirectory());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
