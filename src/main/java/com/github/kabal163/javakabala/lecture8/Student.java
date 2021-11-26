package com.github.kabal163.javakabala.lecture8;

import java.io.Serializable;

/**
 * <b>ВАЖНО! Если вы хотите сериализовать класс через
 * Java сериализацию, то он должен имплементировать
 * интерфейс {@link Serializable}</b>
 * <p>
 * Класс, используемый в качестве примера записи
 * объекта в файл.
 */
public class Student implements Serializable {

    private String fullName;
    private int age;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}