package com.github.kabal163.javakabala.old.lecture8;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class PolymorphismStreamExample {

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
            throw new IllegalArgumentException("InputStream must not be null!"); // проверяйте входные параметры в public методах. Вы не знаете, какой идиот будет его вызывать и как он это будет делать
        }

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];

        if (in.available() != 0) {
            for (int length; (length = in.read(buffer, 0, buffer.length)) != -1; ) { // в цикле читаем байты и кладем их в буфер
                out.write(buffer, 0, length); // теперь, все что записали в буфер, кладем в поток исходящих данных
            }
            System.out.println("Прочитано из InputStream: " + out.toString(StandardCharsets.UTF_8));
        } else {
            System.out.println("Во входящем потоке пусто");
        }
    }
}
