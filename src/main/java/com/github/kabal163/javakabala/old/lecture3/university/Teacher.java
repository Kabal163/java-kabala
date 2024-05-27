package com.github.kabal163.javakabala.old.lecture3.university;

import java.util.Objects;

/**
 * Класс описывает преподавателя
 */
public class Teacher {

    /**
     * Полное имя преподавателя.
     * Например "Иванов Иван Иванович"
     */
    private String fullName;

    /**
     * Возраст преподавателя (в годах)
     */
    private int age;

    /**
     * Опыт работы (в месяцах)
     */
    private int experience;

    /**
     * Название курса
     */
    private String course;

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

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher)) return false;
        Teacher teacher = (Teacher) o;
        return age == teacher.age &&
                experience == teacher.experience &&
                Objects.equals(fullName, teacher.fullName) &&
                Objects.equals(course, teacher.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, age, experience, course);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                ", course='" + course + '\'' +
                '}';
    }
}
