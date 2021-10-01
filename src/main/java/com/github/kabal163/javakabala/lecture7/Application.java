package com.github.kabal163.javakabala.lecture7;

import com.github.kabal163.javakabala.lecture7.exception.MagicBoxOpeningException;
import com.github.kabal163.javakabala.lecture7.exception.ResourceNotFoundException;

import java.io.IOException;

/**
 * Лекция №7: Исключения
 */
public class Application {

    public static void main(String[] args) {
//        runCheckedExceptionExample(); // мы видим, что нам нужно либо обработать исключение, либо пробросить его дальше.

        try {
            runCheckedExceptionExample(); // пример того, как мы обрабатываем исключение, которые метод может кинуть
        } catch (IOException e) { // тут объявляются исключения, которые мы хотим перехватывать
            System.out.println("Мы перехватили исключение: " + e.getMessage()); // обрабатываем исключение. Тут можно делать что-то более осознанное. Но в данном случае мы просто печатаем stacktrace
        }
        System.out.println("----------------");

        // пример перехвата проверяемого исключения
        try {
            FileReader.readBytes(); // Опять таки, можем не обрабатывать, а также прокинуть дальше
        } catch (IOException e) {
            System.out.println("Мы перехватили исключение: " + e.getMessage());
        }
        System.out.println("----------------");

        // пример перехвата непроверяемого исключения
        try {
            ResourceFinder.findResource();
        } catch (ResourceNotFoundException e) {
            System.out.println("Мы перестраховались и перехватили непроверяемое исключение: " + e.getMessage());
        }
        System.out.println("----------------");

        // пример finally
        try {
            MagicalBox.open();
            System.out.println("Ураа! Коробочка открылась!");
        } catch (MagicBoxOpeningException e) {
            System.out.println("Ошибка при открытии магической коробки: " + e.getMessage());
        } finally {
            System.out.println("В любом случае закрываем коробку"); // данный блок будет выполнен в любом случае
            MagicalBox.close();
        }
        System.out.println("----------------");

        // пример перехвата нескольких исключений
        try {
            MagicalBox.open();
            ResourceFinder.findResource();
        } catch (ResourceNotFoundException e) {
            System.out.println("Магическая коробка открылась, но произошла ошибка при чтении ресурса: " + e.getMessage());
        } catch (MagicBoxOpeningException e) {
            System.out.println("Ошибка при открытии магической коробки: " + e.getMessage());
        } finally {
            System.out.println("В любом случае закрываем коробку");
            MagicalBox.close();
        }
        System.out.println("----------------");

        runRethrowExample(); // мы видим, что тут нам уже ничего не нужно перехватывать, однако от исключения нас никто не освобождает
        // именно из-за того, что это исключение никак в итоге не обрабатывается наша программа упадет
    }

    /**
     * Нас никто не обязывает бросать исключение, если мы объявляем
     * его в контракте
     *
     * @throws IOException если что-то произошло... (тут нужно нормальное описание делать!)
     */
    private static void runCheckedExceptionExample() throws IOException {
        System.out.println("Исключение не будет брошено");
    }

    /**
     * Тут видно интересную вещь, что этот метод перехватывает исключение,
     * но при этом бросает другое {@link RuntimeException}, которое уже
     * не нужно объявлять в сигнатуре метода (объявление бросаемого исключения
     * не относится к сигнатуре метода, оно относится к контракту метода)
     */
    private static void runRethrowExample() {
        try {
            FileReader.readBytes();
        } catch (IOException e) {
            System.out.println("Мы перехватили исключение: " + e.getMessage());
            System.out.println("Вместо него мы прокинем непроверяемое RuntimeException исключение, с кодом \"помидорка\"");
            throw new RuntimeException("помидорка", e);
        }
    }
}
