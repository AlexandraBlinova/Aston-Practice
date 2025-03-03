package org.example;

public class Dog extends Animal {

    public static int dogCount = 0;

    public Dog() {
        dogCount++;
    }

    public static int getDogCount() {
        System.out.println("Всего собак: " + dogCount);
        return dogCount;
    }

    public void run(int obstacleLenght){
        if (obstacleLenght > 500) {
            System.out.println("Собака не смогла пробежать");
        }
        else if (obstacleLenght <= 0) {
            System.out.println("Введите корректное значение");
        }
        else {
            System.out.println("Собака" + " пробежала " + obstacleLenght + " метров");
        }

    }
    public void swim(int obstacleLenght) {
        if (obstacleLenght > 10) {
            System.out.println("Собака не смогла проплыть");
        }
        else if (obstacleLenght <= 0) {
            System.out.println("Введите корректное значение");
        }
        else {
            System.out.println("Собака" + " проплыла " + obstacleLenght + " метров");
        }
    }
}
