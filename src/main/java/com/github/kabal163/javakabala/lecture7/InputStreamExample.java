package com.github.kabal163.javakabala.lecture7;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class InputStreamExample {

    public static void main(String[] args) throws IOException {
        String originalName = "Моргенштерн";
        byte[] originalBytes = originalName.getBytes(StandardCharsets.UTF_8); // получаем байтовое представление строки

        printInputData(new ByteArrayInputStream(originalBytes));
        wrapStream();
    }

    /**
     * Представьте, что мы написали метод, в котором хотим что-то
     * сделать с данными, которые получает наша программа. Наша программа
     * может получать данные кучей способов - через сокеты, чтением из
     * файлов, чтением клиентского ввода данных с клавиатуры и тд.
     * Для этого, мы создаем метод, который принимает {@link InputStream}.
     * Как мы помним, это применение полиморфизма. Нам не важно, какой
     * реально там поток - обычный {@link ByteArrayInputStream} или
     * {@link FileInputStream}. Не важно. Мы принимаем любой, читаем из
     * него данные и выводим результат на экран.
     *
     * @param in входные данные, которые пришли откуда-то (нам не важно)
     */
    public static void printInputData(InputStream in) throws IOException {
        if (in == null) {
            throw new IllegalArgumentException("InputStream must not be null!"); // всегда!!! ВСЕГДА проверяйте входные параметры в public методах. Вы не знаете, какой идиот будет его вызывать и как он это будет делать
        }

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];

        if (in.available() != 0) {
            for (int length; (length = in.read(buffer, 0, buffer.length)) != -1; ) { // в цикле читаем байты и кладем их в буфер
                out.write(buffer, 0, length); // теперь, все что записали в буфер, кладем в потом исходящих данных
            }
            System.out.println("Прочитано из InputStream: " + out.toString(StandardCharsets.UTF_8));
        } else {
            System.out.println("Во входящем потоке пусто");
        }
    }

    /**
     * Пример того, как можно обернуть один поток другим,
     * создав цепочку потоков. Не путать с паттерном chain of responsibility!
     * В данном случае применен паттерн Декоратор (или Wrapper, обёртка)
     *
     * @see <a href=https://refactoring.guru/ru/design-patterns/decorator></a>
     */
    public static void wrapStream() {
        // В файле записано число 2021 в бинарном формате, поэтому открыв файл через редактор, вы увидите кракозябру
        final String filename = "src/main/resources/number.txt";

        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            System.out.println("Число, прочитанное из файла: " + dis.readInt());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
