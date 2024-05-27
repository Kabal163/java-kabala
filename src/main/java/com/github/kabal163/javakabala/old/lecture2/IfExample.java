package com.github.kabal163.javakabala.old.lecture2;

public class IfExample {

    public static void runIfExample(boolean condition) {
        if (condition) {
            System.out.println("Условие истино");
        } else {
            System.out.println("Условие ложно");
        }
    }

    public static void runIfExample() {
        if (2 > 3) {
            System.out.println("Это сообщение никогда не будет выводиться");
        } else {
            System.out.println("2 меньше 3");
        }
    }

    public static void runIfExample(String name1, String name2) {
        if (name1.length() > name2.length()) {
            System.out.println(name1 + " длиннее чем " + name2);
        } else if (name1.startsWith("a")) {
            System.out.println(name1 + " имя начинается с буквы 'а'");
        } else if (name1.charAt(0) == 'и') {
            System.out.println(name1 + " имя начинается с буквы 'и'");
        } else {
            System.out.println("Ни одно из условий не подошло");
        }
    }

    /**
     * Тернарные оператор boolean expression ? true result : false result
     * Это равносильно if (boolean expression) true result; else false result;
     *
     * @param anyNumber любое число, используемое для работы примера
     */
    public static void runTernaryExample(int anyNumber) {
        String message = anyNumber > 5
                ? "Ваше число больше 5"
                : "Ваше число меньше или равно 5";
        System.out.println(message);
    }
}
