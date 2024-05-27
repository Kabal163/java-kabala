package com.github.kabal163.javakabala.remastering.oop.polymorphism;

public class Application {

    public static void main(String[] args) {
        Hero elrond = new Elf("Элронд", 10_000, 800, 3000, 999);
        Orc urukHai = new Orc("Урук-хай", 150, 18, 30, 60);
        Hero gimli = new Dwarf("Гимли", 1000, 200, 400, 250, 0.3);

        elrond.attack(urukHai);
        gimli.attack(urukHai);

        urukHai.useDefence();
        urukHai.attack(elrond);
        urukHai.attack(gimli);
    }
}
