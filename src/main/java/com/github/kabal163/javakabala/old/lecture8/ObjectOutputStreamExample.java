package com.github.kabal163.javakabala.old.lecture8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {

    /**
     * Пример того, как можно сериализовать Java объекты
     * и записывать их в бинарном виде в файл
     */
    public static void writeJavaObjectToFile(String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            Student student = new Student();
            student.setAge(21);
            student.setFullName("Иванов Иван Иванович");

            out.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Мы успешно сохранили наш объект в файл. Давайте теперь прочитаем его от туда...");
    }
}
