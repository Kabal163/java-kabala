package com.github.kabal163.javakabala.old.lecture3.university;

import java.util.Objects;

/**
 * Класс описывает студента
 */
public class Student {

    /**
     * Полное имя студента.
     * Например "Иванов Иван Иванович"
     */
    private String fullName;

    /**
     * Возраст студента (в годах)
     */
    private int age;

    /**
     * Зачетная книжка.
     * Пример Композиции.
     * Сам по себе объект зачетной книжки не
     * имеет значения, без объекта типа Student
     */
    private RecordBook recordBook;

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

    public RecordBook getRecordBook() {
        return recordBook;
    }

    public void setRecordBook(RecordBook recordBook) {
        this.recordBook = recordBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(fullName, student.fullName) &&
                Objects.equals(recordBook, student.recordBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, age, recordBook);
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", recordBook=" + recordBook +
                '}';
    }
}
