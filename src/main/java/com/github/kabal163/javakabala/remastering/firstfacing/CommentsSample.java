package com.github.kabal163.javakabala.remastering.firstfacing;

/**
 * То, что вы сейчас читаете, называется комментарием.
 * Тут вы можете писать что угодно, т.к. этот участок
 * не будет выполняться.
 * Конкретно этот комментарий называется JavaDoc - документация
 * вашего когда. Мы видим, что он зеленого цвета. Это частный
 * случай комментария.
 *
 * На самом деле, не нужно писать что угодно! Пишите только
 * самое необходимое. Например, в JavaDoc вы должны описывать
 * то, как работает ваш код (верхнеуровнево), чтобы другие
 * разработчики не лезли в него, и не разибрались в том,
 * как он работает, а могли просто прочитать документацию к
 * нему. По сути, что-то вроде инструкции по использованию
 * вашего кода.
 *
 * @author Dmitriy Kanaev
 */
public class CommentsSample {

    // А еще, мы можем писать комментарии после двойного слэша
    // Но если наш комментарий многострочный, то слэши нужно
    // ставить на каждой строчке

    /*
    Если мы имеем многострочный комментарий, то разумнее использовать
    этот формат записи, который позволяет нам сразу определить блок
    комментария. Заметьте, он отличается от JavaDoc. Во первых, JavaDoc
    можно писать только в определенных местах - над классами, методами,
    переменными и т.д. А обычные комментарии, вроде этого мы можем писать
    где угодно. Так же он отличается от JavaDoc тем, что тут мы используем
    одну звездочку после слэша /*, а там две /**
     */

    // todo если вы хотите что-то исправить, но в данный момент вы не
    //      можете (или не хотите) этого делать, при этом, вы не хотите
    //      продолбать это - начинайте ваш комментарий со слова todо.
    //      Тогда ваша среда разработки будет вам постоянно напоминать
    //      об этом.

    // FIXME так же вот такое ключевое слово - флаг на будущее, что нужно
    //      что-то исправить
}
