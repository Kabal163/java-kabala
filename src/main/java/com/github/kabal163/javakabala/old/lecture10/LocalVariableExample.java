package com.github.kabal163.javakabala.old.lecture10;

/**
 * Для того, чтобы улучшить производительность инкремента перменной count,
 * мы копируем ее в локальную перменную 'c' и работаем с ней, т.к. вход в
 * критическую секцию (synchronized) и выход из нее - дорогие операции.
 * Потом значение из 'c' записываем обратно в count.
 *
 */
public class LocalVariableExample {

    private static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            int c = count;
            for (int i = 0; i < 100_000; i++) {
                c++;
            }
            updateCount(c);
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("Результат равен: " + count);
    }

    private static synchronized void updateCount(int c) {
        count += c;
    }
}
