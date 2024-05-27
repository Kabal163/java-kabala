package com.github.kabal163.javakabala.remastering.oop.references;

/**
 * Демонстрирует разницу между "передачей аргумента по значению" и
 * "передачей аргумента по ссылке".
 *
 * @author Dmitriy Kanaev
 */
public class Example1 {

    public static void main(String[] args) {
        int number = 18;
        User user = new User();
        user.setName("Алексей");

        changeInt(number);
        changeUser(user);

        System.out.printf("Теперь число равно: %d%n", number);
        System.out.printf("Теперь user равен: %s%n", user);
    }

    /**
     * В данном случае происходит "передача по значению", т.к. {@code int}
     * является примитивным типом данных, а не ссылочным.
     * Это означает, что значение копируется, и по факту тут мы получаем
     * копию значения.
     *
     * @param number параметр, перемдающийся по значению.
     */
    private static void changeInt(int number) {
        number = 500;
    }

    /**
     * "Передача по ссылке", т.к. {@link User} является ссылочным типо данных
     * (любой тип, кроме примитивного, является ссылочным). В методе мы получаем
     * ссылку на объект, а не его копию.
     *
     * @param user параметр ссылочного типа
     */
    private static void changeUser(User user) {
        user.setName("Иван");
    }
}
