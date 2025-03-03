package org.example;


public class Animal {

    public void getAnimalCount() {
        int animalCount = Dog.getDogCount() + Cat.getCatCount();
        System.out.println("Всего животных: " + animalCount);
    }

    public void run(int obstacleLenght){
        System.out.println(" пробежал " + obstacleLenght + "метров");
    }
    public void swim(int obstacleLenght) {
        System.out.println(" проплыл " + obstacleLenght + " метров");
    }


}
