package com.github.kabal163.javakabala.old.lecture8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamExample {

    /**
     * Пример записи файлов в zip файлы
     */
    public static void writeToZip(String filename) {
        System.out.println("Создание архива: " + filename + "...");
        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(filename))) { // открываем исходящий поток в файл и оборачиваем его zip потоком
            ZipEntry entry1 = new ZipEntry("Первый_файл.txt"); // создаем zip сущность. По сути, это просто файл, который будет в zip архиве
            zout.putNextEntry(entry1); // Кладем эту сущность в поток. Теперь любые данные, которые мы будем передавать в поток будут записаны именно в эту сущность, пока она не будет закрыта
            zout.write("Содержимое первого файла".getBytes()); // Пишем в поток эту строку, она разумеется попадет в первый файл, т.к. он еще не закрыт
            zout.closeEntry(); // вот теперь он закрыт

            // делаем все тоже самое для второго файла
            ZipEntry entry2 = new ZipEntry("Второй_файл.txt");
            zout.putNextEntry(entry2);
            zout.write("Содержимое второго файла".getBytes());
            zout.closeEntry();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Архив успешно создан. Его можно найти в оранжевой папке с названием target");
    }
}
