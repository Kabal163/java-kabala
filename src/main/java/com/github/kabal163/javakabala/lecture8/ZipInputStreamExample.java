package com.github.kabal163.javakabala.lecture8;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import static com.github.kabal163.javakabala.lecture8.PolymorphismStreamExample.printInputData;

public class ZipInputStreamExample {

    /**
     * Пример работы с Zip файлами
     * Обратите внимание, что здесь стримы точно также создаются
     * на основании паттерна Декоратор. Таким образом, вы можете
     * комбинировать различиные стримы, для достижения вашей цели.
     */
    public static void readZip(String filename) {
        System.out.println("Чтение данных из zip архива: " + filename );
        try (ZipInputStream zin = new ZipInputStream(new FileInputStream(filename))) {
            ZipEntry entry;
            while ((entry = zin.getNextEntry()) != null) {
                System.out.println("Название файла в zip архиве: " + entry.getName());
                printInputData(zin); // а вот мы и переиспользовали нашу замечательную функцию, которая умеет работать с InputStream, не взирая на то, какая у него реализвация
                zin.closeEntry();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
