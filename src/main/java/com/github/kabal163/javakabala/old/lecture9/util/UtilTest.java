package com.github.kabal163.javakabala.old.lecture9.util;

import com.github.kabal163.javakabala.old.lecture9.box.GenericBox;

import static com.github.kabal163.javakabala.old.lecture9.util.Util.countGreaterThan;

public class UtilTest {

    public static void main(String[] args) {
        GenericBox<Integer> intBox1 = new GenericBox<>();
        intBox1.put(10);
        GenericBox<Integer> intBox2 = new GenericBox<>();
        intBox2.put(10);

        Util.compare(intBox1, intBox2);
        Util.<Integer>compare(intBox1, intBox2); // аргумент типа можно указать явно, но это ни к чему, т.к. компилятор сам в состоянии понять, какой тип вы используйте

        Integer[] elements = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8};
        Integer element = 5;

        int count = countGreaterThan(elements, element);
        System.out.println(count);
    }
}
