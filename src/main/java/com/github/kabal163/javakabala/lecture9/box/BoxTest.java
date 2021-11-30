package com.github.kabal163.javakabala.lecture9.box;

public class BoxTest {

    public static void main(String[] args) {
        NonGenericBox nonGenericBox = new NonGenericBox();
        nonGenericBox.put(34);
        Object val1 = nonGenericBox.get();

        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.put(34);
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

        example(numberBox); // ок
        // example(intBox); уже не ок, хотя казалось бы...
    }

    private static void example(GenericBox<Number> box) {
        System.out.println(box.get());
    }
}
