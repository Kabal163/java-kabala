package com.github.kabal163.javakabala.old.lecture6;

import com.github.kabal163.javakabala.old.lecture6.exception.MagicBoxClosingException;
import com.github.kabal163.javakabala.old.lecture6.exception.MagicBoxOpeningException;

public class MagicalBox {

    /**
     * Переодически бросает исключение
     *
     * @throws MagicBoxOpeningException если так распорядилась судьба...
     */
    public static void open() throws MagicBoxOpeningException {
        if (Math.random() > 0.5) {
            throw new MagicBoxOpeningException("У магической коробки закончилась энергия");
        }

        System.out.println("Магическая коробочка открылась");
    }

    /**
     * Метод закрывает магическаю коробочку
     *
     * @throws MagicBoxClosingException если у коробочки закончилась энергия
     */
    public static void close() {
        System.out.println("Магическая коробочка закрылась");
    }
}
