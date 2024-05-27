package com.github.kabal163.javakabala.old.lecture3;

import com.github.kabal163.javakabala.old.lecture3.university.Group;
import com.github.kabal163.javakabala.old.lecture3.university.RecordBook;
import com.github.kabal163.javakabala.old.lecture3.university.Student;
import com.github.kabal163.javakabala.old.lecture3.university.Teacher;
import com.github.kabal163.javakabala.old.lecture3.zoo.Dog;

/**
 * Лекция №4: ООП
 */
public class Application {

    public static void main(String[] args) {
        ///////////////////////
        // Создание объектов //
        ///////////////////////

        Dog dog1 = new Dog(); // создаем объект типа Dog с использованием конструктора поумолчанию.
        dog1.setName("Шарик"); // т.к. по дефолту у нас объект создается пустым, мы присваиваем переменной name значение "Шарик"
        dog1.setAge(24); // устанавливаем возраст, равный 24 месяцам
        dog1.setHeight(25); // устанавливаем рост, равный 25 сантиметрам
        dog1.setAngry(false); // устанавливаем признак "Злая собака" false

        System.out.println(dog1); // Выводит в консоль наш объект со всеми установленными значениями. Неявно вызывается метод toString()

        Dog dog2 = new Dog("Рекс", 12); // создаем объект типа Dog используя конструктор, который принимает 2 параметра
        dog2.setHeight(60); // т.к. конструктор, через который мы создали объект не принимает данное значение, мы должны установить его отдельно
        dog2.setAngry(true); // тоже самое с этим значением. Устанавливаем признак "Злая собака" true

        System.out.println(dog2);

        Dog dog3 = new Dog("Гуфи", 41, 50, false); // создаем объект типа Dog, при этом мы сразу задали все значения через конструктор
        System.out.println(dog3);

        dog3.setName("Guffi"); // при этом нам никто не запрещает перезаписать значение, установленное через конструктор
        System.out.println(dog3);

        /////////////////////////////////////////
        // Reassigning - переприсвоение ссылки //
        /////////////////////////////////////////

        dog2 = dog1; // если до этого, каждая переменная ссылалась на разные объекты, то теперь, обе переменные ссылаются на один и тот же объект, который был записан в dog1
        Dog dog4 = dog2; // это можно сделать и с вновь создаваемыми переменными. Теперь все три переменные dog1, dog2 и dog4 ссылаются на один и тот же объект

        System.out.println(); // просто печатаем пустую строку, чтобы в консоле все не смешивалось в кашу
        System.out.println("Доказательство того, что все три переменные это один объект:");
        System.out.println("dog1 = " + dog1);
        System.out.println("dog2 = " + dog2);
        System.out.println("dog4 = " + dog4);
        System.out.println();

        dog4.setName("Измененное имя"); // дополнительное доказательство того, что все три переменные ссылаются на один объект
        System.out.println("Все три переменные ссылаются на один объект. Мы видим, что имя собаки поменялось:");
        System.out.println("dog1 = " + dog1);
        System.out.println("dog2 = " + dog2);
        System.out.println("dog4 = " + dog4);
        System.out.println();

        ////////////////////
        // Потеря объекта //
        ////////////////////

        dog3 = dog1; // теперь все 4 перменных ссылются на один и тот же объект. При этом объект, на который до этого ссылалась переменная dog3 навсегда потерян, т.к. на него больше никто не ссылается
        // такое объект будет удален GC (Garbage Collector) при следующем исполнении
        System.out.println("dog3 = " + dog3);

        dog3 = null; // мы удалили ссылку из переменной dog3. Теперь переменная никуда не ссылается. Однако этот объект не потерян, т.к. на него ссылаются еще три переменных dog1, dog2, dog4

        ////////////////////////////////////
        // Проверка объектов на равенство //
        ////////////////////////////////////

        Dog dog5 = new Dog("Саблезуб", 30, 300, true);

        System.out.println();
        System.out.println("dog1 == dog4: " + (dog1 == dog4)); // данная операция сравнивает ссылки на объекты. dog1 и dog4 это один и тот же объект, поэтому результат true
        System.out.println("dog1 == dog5: " + (dog1 == dog5)); // а вот dog5 это уже другой объект, поэтому результат false

        System.out.println("dog1.equals(dog4): " + (dog1.equals(dog4))); // сравниваем объекты по бизнес логике. См. метод equals. Результат true, т.к. это один и тот же объект, поэтому нет смысла даже сравнивать значения полей
        System.out.println("dog1.equals(dog5): " + (dog1.equals(dog5))); // false т.к. это разные объекты и значения их полей разные

        // Давайте поменяем наш dog5 и сделаем его равным dog1
        // Для этого установим значения переменных из dog1 в dog5
        dog5.setName(dog1.getName());
        dog5.setAge(dog1.getAge());
        dog5.setHeight(dog1.getHeight());
        dog5.setAngry(dog1.isAngry());

        System.out.println();
        System.out.println("dog1.equals(dog5): " + (dog1.equals(dog5))); // true, т.к. теперь хоть это и разные объекты, но их состояние (значение полей) одинаковое
        System.out.println("dog1 == dog5: " + (dog1 == dog5)); // НО по ссылке так же останется false, т.к. это РАЗНЫЕ объекты, просто они имеют одинаковые значения полей

        /////////////////////////////////////////////////////////////
        // Отношения объектов - Агрегация, Ассоциация и Композиция //
        /////////////////////////////////////////////////////////////

        // создаем первого студента
        Student student1 = new Student();
        student1.setFullName("Гришин Павел Валерьевич");
        student1.setAge(20);
        student1.setRecordBook(new RecordBook());

        // создаем второго студента
        Student student2 = new Student();
        student2.setFullName("Артемьев Николай Степанович");
        student2.setAge(21);
        student2.setRecordBook(new RecordBook());

        // создаем преподавателя
        Teacher teacher = new Teacher();
        teacher.setFullName("Степаненко Дарья Дмитриевна");
        teacher.setAge(43);
        teacher.setExperience(68);
        teacher.setCourse("Литератера");

        // создаем группу и добавляем в нее студентов и преподавателя
        Group group = new Group();
        group.setStudents(new Student[]{student1, student2});
        group.setTeacher(teacher);

        System.out.println("Получилась группа: " + group);
    }
}
