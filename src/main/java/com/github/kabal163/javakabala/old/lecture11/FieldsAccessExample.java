package com.github.kabal163.javakabala.old.lecture11;

import java.lang.reflect.Field;

public class FieldsAccessExample {

    public static void main(String[] args) throws IllegalAccessException {
        User user = new User("Вася", 25);
        Class<? extends User> userClass = user.getClass();

        Field[] fields = userClass.getDeclaredFields();

        for (Field field : fields) {
            System.out.println("Название поля: " + field.getName() +
                    "; есть ли доступ к полю: " + field.canAccess(user)); // нет, т.к. оно приватное
            field.setAccessible(true);
            System.out.println("Название поля: " + field.getName() +
                    "; есть ли доступ к полю: " + field.canAccess(user) +
                    "; значение поля: " + field.get(user)); // теперь да, т.к. мы изменили модификатор доступа

            if ("name".equals(field.getName())) {
                field.set(user, "Михаил");
            }
        }

        System.out.println(user);
    }
}
