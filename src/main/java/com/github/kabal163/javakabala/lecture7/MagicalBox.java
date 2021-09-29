package com.github.kabal163.javakabala.lecture7;

import com.github.kabal163.javakabala.lecture7.exception.MagicBoxOpeningException;

public class MagicalBox {

    /**
     * Переодически бросает исключение
     *
     * @throws MagicBoxOpeningException если так распорядилась судьба...
     */
    public static void open() throws MagicBoxOpeningException {
        System.out.println("Магическая коробочка открылась");

        if (Math.random() > 0.5) {
            throw new MagicBoxOpeningException("У магической коробки закончилась энергия");
        }
    }


    public static void close() {
        System.out.println("Магическая коробочка закрылась");
    }
}
