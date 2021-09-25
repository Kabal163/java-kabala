package com.github.kabal163.javakabala.lecture2;

import static com.github.kabal163.javakabala.lecture2.ForExample.runForExample;
import static com.github.kabal163.javakabala.lecture2.IfExample.runIfExample;
import static com.github.kabal163.javakabala.lecture2.IfExample.runTernaryExample;
import static com.github.kabal163.javakabala.lecture2.SwitchExample.Level.*;
import static com.github.kabal163.javakabala.lecture2.SwitchExample.runSwitchExample;
import static com.github.kabal163.javakabala.lecture2.WhileExample.*;

public class Application {

    public static void main(String[] args) {
        System.out.println("\nПример с условными конструкциями\n");

        runIfExample(true);
        runIfExample(false);
        runIfExample();
        runIfExample("Иван", "Александр"); // уйдем в последний else
        runIfExample("Александр", "Иван"); // уйдем в первый if
        runIfExample("александр", "Иван"); // уйдем в первый if, заметьте, что в "имя начинается с буквы 'а'" вы не уйдем, т.к. мы используем else if
        runIfExample("иван", "Александр"); // уйдем в "имя начинается с буквы 'и'"
        runTernaryExample(5);
        runTernaryExample(6);

        System.out.println("\nКонец примера с условными конструкциями\n-------");
        System.out.println("Пример циклов\n");

        runForExample(3);
//        runInfiniteCycle(); // раскомментируй, чтобы посмотреть, как работает бесконечный цикл
        runWhileExample(3);
        runWhileBreakExample(3);
        runDoWhileExample(3);

        System.out.println("\nКонец примера циклов\n-------");
        System.out.println("Пример отличия while от do...while\n");

        runWhileExample(0); // не выполнится ниразу
        runDoWhileExample(0); // выполнится 1 раз, т.к. первая итерация проходит без проверки

        System.out.println("\nКонец примера отличия while от do...while\n-------");
        System.out.println("Пример switch\n");

        runSwitchExample(JUNIOR);
        runSwitchExample(MIDDLE);
        runSwitchExample(SENIOR);
        runSwitchExample(KABAL);

        System.out.println("\nКонец примера switch\n");
    }
}
