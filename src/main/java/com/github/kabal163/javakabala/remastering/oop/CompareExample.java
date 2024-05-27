package com.github.kabal163.javakabala.remastering.oop;

import java.util.Objects;

/**
 * @author Dmitriy Kanaev
 */
public class CompareExample {

    public static void main(String[] args) {
        BadFruit apple = new BadFruit("Яблоко", "Красный", 300);
        BadFruit banana = new BadFruit("Банан", "Желтый", 200);

        // false, т.к. это разные объекты и мы сравниваем разные ссылки
        System.out.println(apple == banana);

        // false, т.к. у данного класса не переопределен метод equals
        System.out.println(apple.equals(banana));

        banana = apple;

        // true, т.к. теперь это один и тот же объект
        // они оба смотрят на яблоко appla
        // так что переменная, которую мы назвали бананом,
        // по факту сейчас является яблоком
        System.out.println(banana == apple);

        // true, т.к. метод equals не переопределен и фактически
        // он просто сравнивает через "=="
        System.out.println(banana.equals(apple));

        GoodFruit orange1 = new GoodFruit("Апельсин", "Оранжевый", 315);
        GoodFruit orange2 = new GoodFruit("Апельсин", "Светло-оранжевый", 400);

        // Очевидно, что false, т.к. это разные объекты
        System.out.println(orange1 == orange1);

        // false, т.к. метод equals переопределен и сравнивает именно состояние
        // объектов (значения их полей)
        System.out.println(orange1.equals(orange1));

        orange2.color = "Оранжевый";
        orange2.weightG = 315;

        // Попрежнему false, так как это попрежнему разные
        // объекты, хоть теперь они и идентичны
        System.out.println(orange1 == orange1);

        // А вот тут мы получаем true, т.к. метод equals переопределен
        // и объекты идентичны
        System.out.println(orange1.equals(orange1));
    }

    private static void equalsContractExample() {
        GoodFruit fruit = new GoodFruit("Банан", "Черный", 200);

        // Пример рефлексивности
        // Вернет true, т.к. объект всегда равен самому себе
        boolean reflective = fruit.equals(fruit); // true

        GoodFruit anotherFruit = new GoodFruit("Банан", "Черный", 200);

        // Пример симметричности
        // Если мы сравниваем fruit с anotherFruit и получаем true,
        // тогда и при сравнениее anotherFruit с fruit мы тоже должны
        // получить true
        fruit.equals(anotherFruit); // true
        anotherFruit.equals(fruit); // true

        GoodFruit thirdFruit = new GoodFruit("Банан", "Черный", 200);

        // Пример транзитивности
        // Если fruit равен anotherFruit, а anotherFruit равен thirdFruit
        // тогда и fruit равен thirdFruit. А по правилу симметиричности мы знаем,
        // что раз fruit равен thirdFruit, то и thirdFruit равен fruit
        fruit.equals(anotherFruit); // true
        anotherFruit.equals(thirdFruit); // true
        fruit.equals(thirdFruit); // true

        // Пример согласованности
        // т.к. мы не изменяем эти объекты между вызовами, то мы всегда
        // получаем один и тот же результат
        fruit.equals(anotherFruit);
        fruit.equals(anotherFruit);
        fruit.equals(anotherFruit);
        fruit.equals(anotherFruit);

        // Сравнение с null всегда false%
        fruit.equals(null);
    }

    private static void hashCodeContractExample() {
        GoodFruit fruit = new GoodFruit("Банан", "Черный", 200);

        // Все вызовы обязаны вернуть один и тот же хэшкод
        fruit.hashCode();
        fruit.hashCode();
        fruit.hashCode();

        fruit.name = "Апельсин";

        // Т.к. это значение участвует в расчете hashCode, а мы его изменили,
        // то и значение хэшкода тоже изменится
        fruit.hashCode();

        GoodFruit anotherFruit = new GoodFruit(fruit.name, fruit.color, fruit.weightG);

        // Если два объекта равны. то хэшкод обязан быть одинаковым
        System.out.println(fruit.hashCode() == anotherFruit.hashCode());

        GoodFruit thirdFruit = new GoodFruit("Груша", "Желтый", 311);

        // С огромной долей вероятности их хэшкоды будут разными,
        // одако вполне себе существует вероятность того, что произойдет коллизия
        System.out.println(fruit.hashCode() == thirdFruit.hashCode());
    }

    private static final class BadFruit {
        private String name;
        private String color;
        private int weightG;

        public BadFruit(String name, String color, int weightG) {
            this.name = name;
            this.color = color;
            this.weightG = weightG;
        }
    }

    private static final class GoodFruit {
        private String name;
        private String color;
        private int weightG;

        public GoodFruit(String name, String color, int weightG) {
            this.name = name;
            this.color = color;
            this.weightG = weightG;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            GoodFruit goodFruit = (GoodFruit) o;
            return weightG == goodFruit.weightG
                && Objects.equals(name, goodFruit.name)
                && Objects.equals(color, goodFruit.color);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, color, weightG);
        }
    }
}
