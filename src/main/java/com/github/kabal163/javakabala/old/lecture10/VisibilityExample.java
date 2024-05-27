package com.github.kabal163.javakabala.old.lecture10;

import lombok.SneakyThrows;

/**
 * Добиться reordering очень сложно. У меня это
 * сделать не получилось.
 * Зато, данный пример очень хорош для демонстрации
 * проблем visibility
 *
 * В данном случае, второй поток будет висеть до тех пор,
 * пока не увидит изменения, сделанные основным потоком.
 * Чтобы исправить проблему, достаточно добавить ключевое
 * слово volatile к переменной {@link Holder#second}
 */
public class VisibilityExample {

    public static void main(String[] args) throws InterruptedException {
        Holder holder = new Holder();

        Runnable checker = holder::checkValues; // должен увидеть изменения после того, как значение будет изменено
        new Thread(checker).start();

        Thread.sleep(100);

        holder.setValues();
        System.out.println("Значение изменено!");
    }

    private static final class Holder {
        boolean first = false;
        boolean second = false;

        void setValues() {
            second = true;
            first = true;
        }

        @SneakyThrows
        void checkValues() {
            while (!second) {};
            System.out.println("Я увидел изменения!");
        }
    }
}
