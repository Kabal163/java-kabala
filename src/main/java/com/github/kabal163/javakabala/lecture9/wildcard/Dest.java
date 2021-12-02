package com.github.kabal163.javakabala.lecture9.wildcard;

import lombok.Data;

@Data
public class Dest<T> {

    private T value;
}
