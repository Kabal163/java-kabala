package com.github.kabal163.javakabala.old.lecture7.shop;

import lombok.Data;

/**
 * Продавец
 */
@Data
public class Seller {

    /**
     * Полное имя продавца
     * Например: Иванов Иван Иванович
     */
    private final String fullName;

    /**
     * Опыт работы в месяцах
     */
    private final int experience;
}
