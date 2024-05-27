package com.github.kabal163.javakabala.remastering.oop.references;

/**
 * Еще один пример того, как разные переменные могут ссылаться
 * на один и тот же объект.
 *
 * @author Dmitriy Kanaev
 */
public class Example2 {

    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();

        user1.setName("Алексей");
        user2.setName("Михаил");

        user2 = user1;
        // Теперь обе переменные ссылаются на Алексея
        // А ссылка на Михаила навсегда потеряна и
        // в ближайшее время GC удалит этот объект как мусор

        System.out.printf("Теперь user1 равен: %s%n", user1);
        System.out.printf("Теперь user2 равен: %s%n", user2);

        user1.setName("Володя");
        // Т.к. у нас обе переенные ссылаются на один и тот
        // же объект, то если мы изменяем наш объект (не важно,
        // через какую переменную), это будет видно во всех переменных
        // которые ссылаются на данный объект
        // Поэтому user2 это тот же самый user1, а значит Володя
        System.out.printf("Чему же теперь равен user2: %s%n", user2);
    }
}
