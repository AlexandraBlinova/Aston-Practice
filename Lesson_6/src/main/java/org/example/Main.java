package org.example;

public class Main {
    public static void main(String[] args) {
        Cat basik = new Cat();
        Cat burg = new Cat();
        Dog bublik = new Dog();
        Animal zivotnoe = new Animal();

        basik.run(20);
        bublik.run(500);
        basik.swim(5);
        bublik.swim(11);
        zivotnoe.getAnimalCount();

    }
}