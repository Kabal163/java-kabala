package com.github.kabal163.javakabala.lecture9.util;

import com.github.kabal163.javakabala.lecture9.box.GenericBox;

public final class Util {

    private Util() {
    }

    public static <T> boolean compare(GenericBox<T> box1, GenericBox<T> box2) {
        return box1.get().equals(box2.get());
    }

    public static <T extends Comparable<T>> int countGreaterThan(T[] elements, T element) {
        int count = 0;
        for (T e : elements)
            if (e.compareTo(element) > 0)
                ++count;
        return count;
    }
}
