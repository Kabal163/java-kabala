package com.github.kabal163.javakabala.old.lecture7;

import com.github.kabal163.javakabala.old.lecture7.shop.Seller;
import com.github.kabal163.javakabala.old.lecture7.shop.Shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Лекция №7: Коллекции
 */
public class Application {

    public static void main(String[] args) {
        Seller seller1 = new Seller("Иванов Иван Иванович", 25);
        Seller seller2 = new Seller("Иванов Максим Иванович", 25);

        ArrayList<Seller> sellers = new ArrayList<>();
        sellers.add(seller1);
        sellers.add(seller2);

        Map<String, Seller> sellersByFullName = new HashMap<>();
        sellersByFullName.put(seller1.getFullName(), seller1);
        sellersByFullName.put(seller2.getFullName(), seller2);

        Shop shop = new Shop(sellers, sellersByFullName);

        System.out.println("Наш магазин: " + shop);

        emulateSeller(shop);
        emulateCustomers(shop);
    }

    private static void emulateCustomers(Shop shop) {
        for (int i = 0; i < 10; i++) {
            shop.acceptOrder("Новый заказ №" + i);
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
        shop.close();
    }

    private static void emulateSeller(Shop shop) {
        shop.open();
        new Thread(() -> {
            while (shop.hasOrders() || !shop.isClosed()) {
                shop.processOrder();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }
        }).start();
    }
}
