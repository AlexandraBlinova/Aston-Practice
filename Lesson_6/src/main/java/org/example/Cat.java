package org.example;

public class Cat extends Animal {

    public static int catCount = 0;

    public Cat() {
        catCount++;
    }

    public static int getCatCount() {
        System.out.println("Всего котов: " + catCount);
        return catCount;
    }


    public void run(int obstacleLenght){
        if (obstacleLenght > 0 && obstacleLenght < 200) {
            System.out.println("Кот" + " пробежал " + obstacleLenght + "метров");
        }
        else if (obstacleLenght > 200) {
            System.out.println("Кот не смог пробежать");
        }
        else {
            System.out.println("Введите корректное значение");
        }

    }
    public void swim(int obstacleLenght) {
        System.out.println("Кот не умеет плавать");
    }
}
