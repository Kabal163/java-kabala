package com.github.kabal163.javakabala.lecture4.university;

import java.util.Arrays;
import java.util.Objects;

/**
 * Класс описывает группу студентов.
 */
public class Group {

    /**
     * Студенты, который находятся в данной группе.
     * Это пример "Агрегации". Данный класс агрегирует
     * в себе студентов.
     */
    private Student[] students;

    /**
     * Учитель, который ведет предмерты в данной группе.
     * Это пример Ассоциации, т.к. учитель, гипотетически,
     * может не состоять в группе, а вести индивидуальные
     * занятия.
     */
    private Teacher teacher;

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group)) return false;
        Group group = (Group) o;
        return Arrays.equals(students, group.students) &&
                Objects.equals(teacher, group.teacher);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(teacher);
        result = 31 * result + Arrays.hashCode(students);
        return result;
    }

    @Override
    public String toString() {
        return "Group{" +
                "students=" + Arrays.toString(students) +
                ", teacher=" + teacher +
                '}';
    }
}
