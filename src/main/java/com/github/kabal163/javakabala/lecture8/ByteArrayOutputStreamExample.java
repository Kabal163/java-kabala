package com.github.kabal163.javakabala.lecture8;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ByteArrayOutputStreamExample {

    /**
     * Пример работы с {@link ByteArrayOutputStream}
     */
    public static void writeToAndReadFromStream() {
        final String originalString = "Моргенштерн";


        byte[] originalBytes = originalString.getBytes(StandardCharsets.UTF_8); // получаем байтовое представление строки
        ByteArrayOutputStream out = new ByteArrayOutputStream(); // создаем поток
        System.out.println("Строка, преобразованная в массив байт: " + originalString);

        try {
            out.write(originalBytes); //  записываем в поток
        } catch (IOException e) {
            e.printStackTrace();
        }

        byte[] restoredBytes = out.toByteArray(); // Вычитали байты обратно. Можно сразу вычитать строку out.toString()
        String restoredString = new String(restoredBytes);

        System.out.println("Восстановленная строка: " + restoredString);
    }
}
