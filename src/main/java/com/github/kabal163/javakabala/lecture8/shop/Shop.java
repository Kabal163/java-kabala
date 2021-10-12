package com.github.kabal163.javakabala.lecture8.shop;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Магазин
 */
@Data
public class Shop {

    /**
     * Продавцы, работающие в магазине
     */
    private final List<Seller> sellers;

    /**
     * Ассоциативный массив, он же мапа.
     * В качестве ключа используем строку. В нашем случае
     * это полное имя продавца. В качестве значения
     * используем самого продавца.
     */
    private final Map<String, Seller> sellersByFullName;

    /**
     * Очередь с заказами
     */
    private final Queue<String> orders = new ConcurrentLinkedQueue<>();

    /**
     * Признак "магазин открыт". Если {@code true},
     * значит магазин открыт, иначе {@code false}
     */
    @Setter(AccessLevel.NONE)
    private volatile boolean closed;

    /**
     * Закрыть магазин
     */
    public synchronized void close() {
        System.out.println("Магазин закрыт");
        closed = true;
    }

    /**
     * Открыть магазин
     */
    public synchronized void open() {
        System.out.println("Магазин открыт");
        closed = false;
    }

    /**
     * Выбирает продовца и обрабатывает заказ
     */
    public void processOrder() {
        Seller seller = sellers.stream()
                .findAny()
                .orElseThrow(() -> new IllegalStateException("В магазине нет ни одного продавца!"));

        String order = orders.poll();
        if (order != null) {
            System.out.println("Продавец " + seller.getFullName() + " взял закза [" + order + "] в работу");
        }
    }

    /**
     * Принимает заказ и кладет его в очередь
     *
     * @param order заказ
     */
    public void acceptOrder(String order) {
        System.out.println("Дзынь, дзынь! Принят новый заказ: " + order);
        orders.add(order);
    }

    public boolean hasOrders() {
        return !orders.isEmpty();
    }
}
