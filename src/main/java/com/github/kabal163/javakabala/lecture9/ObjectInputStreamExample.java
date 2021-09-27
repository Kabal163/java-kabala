package com.github.kabal163.javakabala.lecture9;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamExample {

    public static void printStudentFromFile(String filename) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            Student student = (Student) in.readObject(); // Тут нам необходимо явно кастовать тип. Если вдруг окажется так, что в фалйе был сохранен объект другого типа, тогда упадем с ошибкой ClassCastException

            System.out.println("Прочитанный из файла объект: " + student);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
