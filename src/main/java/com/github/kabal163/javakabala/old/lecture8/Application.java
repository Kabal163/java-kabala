package com.github.kabal163.javakabala.old.lecture8;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static com.github.kabal163.javakabala.old.lecture8.ByteArrayOutputStreamExample.writeToAndReadFromStream;
import static com.github.kabal163.javakabala.old.lecture8.FileExample.createFileExample;
import static com.github.kabal163.javakabala.old.lecture8.ObjectInputStreamExample.printStudentFromFile;
import static com.github.kabal163.javakabala.old.lecture8.ObjectOutputStreamExample.writeJavaObjectToFile;
import static com.github.kabal163.javakabala.old.lecture8.PolymorphismStreamExample.printInputData;
import static com.github.kabal163.javakabala.old.lecture8.StreamsWrapperExample.wrapStream;
import static com.github.kabal163.javakabala.old.lecture8.ZipInputStreamExample.readZip;
import static com.github.kabal163.javakabala.old.lecture8.ZipOutputStreamExample.writeToZip;

/**
 * Лекция №8: Обмен данными
 */
public class Application {

    public static void main(String[] args) {
        runZipStreamExample();
        runObjectStreamExample();
        runByteArrayOutputStream();
        runPolymorphismExample();
        runStreamWrapperExample();
        runFileExample();
    }

    private static void runZipStreamExample() {
        final String filename = "target/out_zip.zip";

        System.out.println("\n\nЗапуск примера с zip потоками\n...");

        writeToZip(filename);
        readZip(filename);

        System.out.println("...\nПример с zip протоками успешно завершен");
    }

    private static void runObjectStreamExample() {
        final String filename = "target/object.bin"; // расширение файла ни на что не влияет (Вообще, с технической точки зрения расшерения не существует. Это все название файла). Можете хоть .hui сделать

        System.out.println("\n\nЗапуск примера с Object потоками\n...");

        writeJavaObjectToFile(filename);
        printStudentFromFile(filename);

        System.out.println("...\nПример с Object протоками успешно завершен");
    }

    private static void runByteArrayOutputStream() {
        System.out.println("\n\nЗапуск примера с ByteArrayOutputStream\n...");

        writeToAndReadFromStream();

        System.out.println("...\nПример с ByteArrayOutputStream успешно завершен");
    }

    private static void  runPolymorphismExample() {
        System.out.println("\n\nЗапуск примера с применением полиморфизма\n...");

        String originalName = "Алишер";
        byte[] originalBytes = originalName.getBytes(StandardCharsets.UTF_8); // получаем байтовое представление строки

        try {
            printInputData(new ByteArrayInputStream(originalBytes));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("...\nПример с применением полиморфизма успешно завершен");
    }

    private static void runStreamWrapperExample() {
        System.out.println("\n\nЗапуск примера со stream wrapper\n...");

        wrapStream();

        System.out.println("...\nПример со stream wrapper успешно завершен");
    }

    private static void runFileExample() {
        System.out.println("\n\nЗапуск примера работы с файлами\n...");

        createFileExample();

        System.out.println("...\nПример работы с файлами завершен");
    }
}
