package com.github.kabal163.javakabala.remastering.firstfacing;

/**
 * @author Dmitriy Kanaev
 */
public class Cycles {

    public static void main(String[] args) {

        // Пример цикла for
        // int i = 0 - это инициализация счетчика, значение которого
        //             при старте цикла будет равно 0
        // i < 10    - это условия выполнения очередной итерации. Мы
        //             проверяем, если текущее значение i меньше 10,
        //             тогда заходим в цикл и делаем очередную итерацию
        // i++       - инкремент нашего счетчика (увеличение его на 1).
        //             Увеличение происходит после каждой итерации
        // Таким образом наш цикл выведет на экран занчения: 0 1 2 3 4 5 6 7 8 9
        for(int i = 0; i < 10; i++) {
            System.out.printf("%d%n", i);
        }

        // Такой же цикл, только через конструкцию while
        int count = 0;
        while (count < 10) {
            System.out.printf("%d%n", count);
            count++;
        }
    }
}
