package com.github.kabal163.javakabala.lecture6;

import com.github.kabal163.javakabala.lecture6.exception.ResourceNotFoundException;

public class ResourceFinder {

    public static String findResource() {
        System.out.println("Начал поиск ресурса...");

        throw new ResourceNotFoundException("Такого ресурса не найдено!");
    }
}
