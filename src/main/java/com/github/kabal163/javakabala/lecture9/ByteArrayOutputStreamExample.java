package com.github.kabal163.javakabala.lecture9;

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
        ByteArrayOutputStream baos = new ByteArrayOutputStream(); // создаем поток
        System.out.println("Строка, преобразованная в массив байт: " + originalString);

        try {
            baos.write(originalBytes); //  записываем в поток
        } catch (IOException e) {
            e.printStackTrace();
        }

        byte[] restoredBytes = baos.toByteArray(); // Вычитали байты обратно. Можно сразу вычитать строку baos.toString()
        String restoredString = new String(restoredBytes);

        System.out.println("Восстановленная строка: " + restoredString);
    }
}
