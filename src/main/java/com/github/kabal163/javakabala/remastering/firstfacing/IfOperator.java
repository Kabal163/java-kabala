package com.github.kabal163.javakabala.remastering.firstfacing;

/**
 * @author Dmitriy Kanaev
 */
public class IfOperator {

    public static void main(String[] args) {
        double a = Math.random();
        double b = Math.random();

        // Очень простая конструкциюя:
        // Если a больше чем b, тогда заходим в тело условного
        // оператора и выполняем код, который в нем находится
        if (a > b) {
            System.out.println("a > b");
        }

        // Конструкция if else
        // Тоже самое, только добавляется условие "иначе" - else
        // Это значит, что если выражение в if ложно, тогда мы
        // уйдем в секцию кода else
        if (a * 100 < 50) {
            System.out.println("a * 100 < 50");
        } else {
            System.out.println("a * 100 > 50");
        }

        // Тоже самое, только else теперь содержит дополнительное условие
        // Таким образом мы можем выполнить нужный нам участок кода в
        // зависимости от результата вычисления
        if (a * 100 < 10) {
            System.out.println("a * 100 < 10");
        } else if (a * 100 < 20) {
            System.out.println("a * 100 < 20");
        } else if (a * 100 < 30) {
            System.out.println("a * 100 < 30");
        } else {
            System.out.println("a * 100 >= 30");
        }
    }
}
