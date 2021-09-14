package com.github.kabal163.javakabala.lecture7;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class OutputStreamExample {

    public static void main(String[] args) {
        String originalName = "Моргенштерн";
        byte[] originalBytes = originalName.getBytes(StandardCharsets.UTF_8); // получаем байтовое представление строки

        ByteArrayOutputStream baos = new ByteArrayOutputStream(); // создаем поток

        try {
            baos.write(originalBytes); //  записываем в поток
        } catch (IOException ex) {
            System.out.println(ex);
        }

        byte[] restoredBytes = baos.toByteArray(); // Вычитали байты обратно. Можно сразу вычитать строку baos.toString()
        String restoredName = new String(restoredBytes);

        System.out.println("Восстановленное имя: " + restoredName);
    }
}
