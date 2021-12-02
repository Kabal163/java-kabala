package com.github.kabal163.javakabala.lecture9.wildcard;

public class WildcardTest {

    public static void main(String[] args) {
        Source<Integer> src = new Source<>();
        src.setValue(3);

        Dest<Number> dest = new Dest<>();

        copy(src, dest);
    }

    public static void copy(Source<? extends Number> src,
                            Dest<? super Number> dest) {
        Number value = src.getValue();
        dest.setValue(value);
    }
}
