package com.github.kabal163.javakabala.lecture11;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class NewInstanceExample {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<User> userClass = User.class;
        Constructor<User> constructor = userClass.getDeclaredConstructor();

        User user = constructor.newInstance();

        System.out.println(user);

        Constructor<User> constructorWithParams = userClass.getDeclaredConstructor(String.class, int.class);
        User user2 = constructorWithParams.newInstance("Альберт", 55);

        System.out.println(user2);
    }
}
