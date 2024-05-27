package com.github.kabal163.javakabala.remastering.oop.objects;

/**
 * @author Dmitriy Kanaev
 */
public class Example2 {

    public static void main(String[] args) {
        // В данном случае мы вызываем тот самый конструктор,
        // который не принимает аргументы, но устанавливает хардкодные
        // значения
        User user1 = new User();

        // Пример того, как мы с вами вызываем конструктор, который
        // объявили - тот, что принимает на вход два параметра и
        // записывает их значения в наши переменные
        User user2 = new User("dimka@mail.ru", "myPassword");

        // Выведет пользователя с именем "vlad.k@yandex.ru" и
        // паролем "1993pwd"
        System.out.printf("user1: %s%n", user1);

        // Выведет пользователя с именем и паролем, что мы задали явно
        System.out.printf("user2: %s%n", user2);
    }
}
