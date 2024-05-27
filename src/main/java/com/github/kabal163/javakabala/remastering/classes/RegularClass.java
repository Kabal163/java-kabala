package com.github.kabal163.javakabala.remastering.classes;

/**
 * Пример самого обычного класса, из которых мы и будем создавать наши
 * с вами приложения
 */
public class RegularClass {

    /**
     * В классе мы также можем объявлять интерфейсы. Они всегда
     * являются членами класса (так же как и вложенные статические классы)
     */
    @FunctionalInterface
    public interface Executor {
        void execute();
    }

    /**
     * Самый распространенный и удобный способ работы с функциональными
     * интерфейсами - лямбда выражения.
     */
    public Executor lambdaExample() {
        return  () -> { /* реализация */ };
    }

    private int count;
    private static final int MAX_COUNT = 10_000;

    /**
     * Мы можем в классе объявлять вложенные классы. Это пример
     * вложенного статического класса. Из такого класса мы можем
     * обращаться к статическим членам внешнего класса.
     */
    public static class InnerStaticClass {
        void printSomething() {
            System.out.println(MAX_COUNT);

            // При этом доступа к нестатическим членам у нас нет
            // Если убрать комментарий с кода ниже - компилятор выдаст ошибку
            // System.out.println(count);
        }
    }

    /**
     * А это пример вложенного нестатического класса. В нем мы можем обращаться
     * как к статическим, так и нестатическим членам внешнего класса.
     */
    public class InnerClass {

        public void printSomething() {
            System.out.println(MAX_COUNT);
            System.out.println(count);
        }

        /**
         * Да, мы можем продолжить вложенность сколь нам угодно
         */
        public static class MoreInnerClass {
            // ...
        }
    }


    /**
     * Иногда, мы не хотим создавать отдельный класс, чтобы реализовывать
     * какой-то функционал. Часто это бывает, когда у нас нет состояния и
     * нам требуется реализовать всего один (ну может два) метод. В таком
     * случае мы можем объявить класс прямо в методе, написать реализацию
     * метода и вернуть экземпляр этого класса.
     */
    public Executor localClass() {

        class LocalClass implements Executor {

            @Override
            public void execute() {
                // Реализация
            }
        }

        return new LocalClass();
    }
}
