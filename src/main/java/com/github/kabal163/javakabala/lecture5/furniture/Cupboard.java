package com.github.kabal163.javakabala.lecture5.furniture;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Шкаф
 *
 * todo Обратите внимание на огромное кол-во конструкторов.
 *  Подумайте, как этого можно избежать
 */
public class Cupboard extends Furniture {

    /**
     * Двери, установленные на шкаф
     */
    private List<Door> doors;

    public Cupboard(String color,
                    BigDecimal price,
                    List<Door> doors) {
        super(color, price);
        this.doors = doors;
    }

    public Cupboard(String color, BigDecimal price) {
        this(color, price, new ArrayList<>()); // таким образом мы можем переиспользовать уже существующие конструкторы
    }

    public Cupboard(BigDecimal price, List<Door> doors) {
        super(price);
        this.doors = doors;
    }

    public Cupboard(BigDecimal price) {
        this(price, new ArrayList<>()); // тут тоже самое, переиспользуем существующий конструктор
    }

    public boolean hasDoors() {
        return !doors.isEmpty();
    }

    public List<Door> getDoors() {
        return doors;
    }

    public void setDoors(List<Door> doors) {
        this.doors = doors;
    }

    /**
     * Пример переопередения метода
     *
     * Окрашивает шкаф в заданный цвет {@code color}
     * Так же, если на шкаф установлены двери, они будут
     * окрашены в этот же цвет.
     * Если двери должны быть окрашены в другой цвет, тогда
     * их нужно устанавливать после того, как шкаф будет
     * окрашен.
     *
     * @param color цвет, в который нужно окрасить шкаф
     */
    @Override
    public void setColor(String color) {
        super.setColor(color);
        doors.forEach(it -> it.setColor(color));
    }

    /**
     * Обратите внимае, что мы используем атрибуты
     * суперкласса
     *
     * @return строковое представление объект
     */
    @Override
    public String toString() {
        return "Cupboard{" +
                "doors=" + doors +
                ", price=" + super.getPrice() +
                ", color=" + super.getColor() +
                '}';
    }

    /**
     * Дверь шкафа
     * Обратите внимание на то, что это inner class
     */
    public static class Door {

        /**
         * Тип двери
         *
         * @see Door.Type
         */
        private final Type type;

        /**
         * Признак, указывающий на то, что на дверь
         * установлено зеркало. Если {@code true},
         * значит на дверь установлено зеркало,
         * иначе {@code false}
         */
        private boolean mirror;

        /**
         * Признак, указывающий на то, что на двери
         * если принт. Если {@code true}, значит на
         * дверь нанесен принт, иначе {@code false}
         */
        private boolean print;

        /**
         * Цвет двери
         */
        private String color;

        public Door(Type type,
                    boolean mirror,
                    boolean print,
                    String color) {
            this.type = type;
            this.mirror = mirror;
            this.print = print;
            this.color = color;
        }

        public Type getType() {
            return type;
        }

        public boolean hasMirror() {
            return mirror;
        }

        public void setMirror(boolean mirror) {
            this.mirror = mirror;
        }

        public boolean hasPrint() {
            return print;
        }

        public void setPrint(boolean print) {
            this.print = print;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        /**
         * Тип двери
         */
        public enum Type {
            /**
             * Раздвижная дверь
             */
            SLIDING,

            /**
             * Распашная дверь
             */
            SWING
        }

        @Override
        public String toString() {
            return "Door{" +
                    "type=" + type +
                    ", mirror=" + mirror +
                    ", print=" + print +
                    ", color='" + color + '\'' +
                    '}';
        }
    }
}
