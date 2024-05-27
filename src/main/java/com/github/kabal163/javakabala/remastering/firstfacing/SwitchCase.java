package com.github.kabal163.javakabala.remastering.firstfacing;

/**
 * @author Dmitriy Kanaev
 */
public class SwitchCase {

    public static void main(String[] args) {
        String name = args[0];

        // Подобно тому, как мы делали проверки в условном операторе,
        // мы делаем тут тоже самое
        switch (name) {
            case "Игорь" -> System.out.println("Это Игорь");
            case "Стеан" -> System.out.println("Это Степан");
            default -> System.out.println("Я хз кто это");
        }
    }
}
