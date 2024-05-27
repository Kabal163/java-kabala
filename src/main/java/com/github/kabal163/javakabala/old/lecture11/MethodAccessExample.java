package com.github.kabal163.javakabala.old.lecture11;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodAccessExample {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        User user = new User();
        Class<? extends User> userClass = user.getClass();

        Method[] methods = userClass.getDeclaredMethods();
        for (Method method : methods) {
            if ("setName".equals(method.getName())) {
                method.invoke(user, "Василий");
            }
            if ("setAge".equals(method.getName())) {
                method.invoke(user, 24);
            }
        }

        System.out.println(user);
    }
}
