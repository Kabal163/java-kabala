package com.github.kabal163.javakabala.lecture4.zoo;

import java.util.Objects;

/**
 * Класс описывает животное - собаку
 */
public class Dog {

    /**
     * Кличка собаки
     */
    private String name;

    /**
     * Возраст собаки
     * Давайте считать, что возраст измеряется в месяцах
     */
    private int age;

    /**
     * Высота собаки
     * Давайте считать, что рост измеряется в сантиметрах
     */
    private int height;

    /**
     * Признак "Злая собака". Если {@code true},
     * значит собака злая, иначе {@code false}
     */
    private boolean angry;


    /**
     * Конструктор по умолчанию.
     * Он не принимает никаких параметров.
     * Если вы не указываете явно в классе
     * никаких конструкторов, тогда данный
     * конструктор создается поумолчанию неявно.
     *
     * Мы так же можем делегировать инициализацию
     * объекта конструкторам ниже. Нам нужно будет
     * передать туда значения поумолчанию.
     *
     * P.S. Конструкторы объявляются сразу после
     * объявления переменных. После конструкторов
     * пишите публичные методы, потом, соответственно
     * protected а за ними private методы...
     * Методы {@link #equals(Object)}, {@link #hashCode()}
     * и {@link #toString()} всегда объявляются в самом низу
     */
    public Dog() {}

    /**
     * Конструктор не обязан принимать все параметры.
     * Он может принимать только часть параметров, и,
     * например, делигировать выполнение другому конструктору.
     * Через ключевое слово this будет вызван подходящий
     * конструктор под заданный набор параметров.
     * В данном случае мы передаем туда два прешедших значения
     * {@code name} и {@code age}, а два других значения
     * у нас в данном случае нет. В таком случае нам ничего
     * не остается, как передать какие-то значения поумолчанию.
     * В данном случае это {@code age = 0} и {@code angry = false}
     * Для того, чтобы изменить их, нужно воспользоваться сеттерами.
     *
     * @param name кличка собаки
     * @param age возраст собаки
     */
    public Dog(String name, int age) {
        this(name, age, 0, false);
    }

    /**
     * Это наш кастомный конструктор.
     * Данный конструктор принимает на вход параметры,
     * чтобы получить новый объект, который сразу готов
     * к работе. У объекта все поля будут заполнены, и
     * нам не нужно будет использовать сеттеры после
     * создания объекта.
     *
     * @param name кличка собаки
     * @param age возраст собаки
     * @param height рост собаки
     * @param angry признак "Злая собака"
     */
    public Dog(String name, int age, int height, boolean angry) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.angry = angry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Обратите внимание, для булевых перменных
     * геттеры имеют префикс is, иногда has
     */
    public boolean isAngry() {
        return angry;
    }

    public void setAngry(boolean angry) {
        this.angry = angry;
    }

    /**
     * Производит проверку на равенство друх объектов -
     * текущего и объекта {@code o}, опираясь на значения
     * полей объекта.
     *
     * @param o объект, который мы хотим проверить на равенство
     *          с текущим
     * @return {@code true} если два объекта равны, с точки
     * зрения бизнеса, иначе {@code false}
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return age == dog.age &&
                height == dog.height &&
                angry == dog.angry &&
                Objects.equals(name, dog.name);
    }

    /**
     * @return хешкод объекта
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, age, height, angry);
    }

    /**
     * @return строковое представление объекта.
     * Состоит из конкатенации названия класса,
     * названий полей и их значений.
     * Данный метод неявно вызывается, например,
     * когда вы хотите вывести в консоль объект:
     * {@code System.out.println(cat)}
     */
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", angry=" + angry +
                '}';
    }
}
