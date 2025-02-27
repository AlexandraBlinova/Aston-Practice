import java.util.Scanner;

public class Lesson_3 { //Task 1
    public static void main(String[] args) {
        //printThreeWords();
        //checkSumSign();
        //printColor();
        //compareNumbers();
        //compareNumbers1();
        //numberinput();

    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }


    private static void checkSumSign() {
        int a = 34;
        int b = 43;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = -124359;
        if (value < 0) {
            System.out.println("Красный");
        }
        if (value >= 1 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    private static void compareNumbers() {
        int a = 12;
        int b = 77;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }

    private static void compareNumbers1() {
        int a = 5;
        int b = 6;
        int c = a + b;
        if (c >= 10 && c <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    private static void numberinput() {
    }

    private static void numberinput(int a) {
        if (a < 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}









