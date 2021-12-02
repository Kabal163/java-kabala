package com.github.kabal163.javakabala.lecture9.box;

public class BoxTest {

    public static void main(String[] args) {
        NonGenericBox nonGenericBox = new NonGenericBox();
        nonGenericBox.put(34);
        Object val1 = nonGenericBox.get();

        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.put(4);
        Integer val2 = intBox.get();

        // Raw type
        GenericBox rawBox = new GenericBox(); // мы не указали аргумент типа
        rawBox.put("Гвозди");
        Object val3 = rawBox.get(); // raw type существуют для обратной совместимости, и в случае их использования, мы получаем легаси поведение - работу с типом Object

        rawBox = intBox; // тут все ок
        intBox = rawBox; // а вот тут нет. Мы получаем предупреждение, что в переменную, которая содержит коробку с интами, мы пытаемся присвоить хз что - коробку с гвоздями

        // Inheritance
        GenericBox<Number> numberBox = new GenericBox<>();
        numberBox.put(2.2f);
        numberBox.put(4); // тут все ок

        example1(numberBox); // ок
//        example1(intBox); //уже не ок, хотя казалось бы...

        example2(intBox); // а вот так уже можно
        example2(numberBox); // number конечно же, тоже можно
    }

    /**
     * Может принимать только тип {@code GenericBox<Number>}
     */
    private static boolean example1(GenericBox<Number> box) {
        return box.get().intValue() % 2 == 0;
    }

    /**
     * Может принимать типы GenericBox типизированный Number или его подтипом
     */
    public static <T extends Number> boolean example2(GenericBox<T> box) {
        return box.get().intValue() % 2 == 0;
    }
}
