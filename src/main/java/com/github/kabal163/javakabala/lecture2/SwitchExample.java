package com.github.kabal163.javakabala.lecture2;

public class SwitchExample {

    public enum Level {
        JUNIOR,
        MIDDLE,
        SENIOR,
        KABAL
    }

    public static void runSwitchExample(Level level) {
        switch (level) {
            case JUNIOR:
                System.out.println("Новичок. Уровень: " + level);
                break; // ох, сколько же багов только потому, что люди забывают писать это заветное слово. Если не сделать beak, тогда выполнение пойдет дальше, в следующий case
            case MIDDLE:
                System.out.println("Средничок. Уровень: " + level);
                break;
            case SENIOR:
                System.out.println("Папка. Уровень: " + level);
                break;
            default:
                System.out.println("Неизвестный уровень: " + level);
        }
    }
}
