package org.example;

public class Main {
    public static void main(String[] args) {
        Cat basik = new Cat();
        Dog chmo = new Dog();
        Animal zivotnoe = new Animal();

        basik.run(10);
        chmo.run(10);
        System.out.println();
        zivotnoe.getAnimalCount();

    }
}