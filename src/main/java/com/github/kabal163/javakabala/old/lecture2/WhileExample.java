package com.github.kabal163.javakabala.old.lecture2;

public class WhileExample {

    public static void runWhileExample(int count) {
        int i = 0;
        while (i < count) {
            System.out.println("Это сообщение выводтся в цикле while. Номер итерации: " + i);
            i++; // не забываем делать инкремент, иначе цикл будет бесконечным
        }
    }

    public static void runWhileBreakExample(int count) {
        int i = 0;
        while (true) { // мы можем объявить потенциально бесконечный цикл, либо задать условие
            if (++i > count) { // в данном случае мы задаем дополнительное условие, по которому нужно выйти из цикла
                break; // данное ключевое слово прерывает выпослнение итерации и цикла в целом. Имейте ввиду, что break можно применять в любых циклах, не только while
            }
            System.out.println("Это сообщение воводится в цикле while с break. Номер итерации: " + i);
        }
    }

    /**
     * Сначала выполняется итерация, лишь потом делается проверка
     *
     * @param count желаемое количество итераций
     */
    public static void runDoWhileExample(int count) {
        int i = 0;
        do {
            System.out.println("Это сообщение выводтся в цикле do...while. Номер итерации: " + i);
            i++;
        } while (i < count);
    }
}
