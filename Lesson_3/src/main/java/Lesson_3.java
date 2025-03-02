import java.util.Arrays;
import java.util.Scanner;

public class Lesson_3 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        compareNumbers1();
        numberin(-12);
        task7(0);
        printStringMultipleTimes("abc", 7);
        task9();
        LeapYear(13);
        task11();
        task12();
        task13();
        table();
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
    private static boolean compareNumbers1() {
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int c = a + b;
        if (c >= 10 && c <= 20) {
            return true;
        } else {
            return false;
        }
    }
    private static void numberin(int a) {
        if (a < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }
    private static boolean task7(int a) {
        boolean check;
        if (a >= 0) {
            check = true;
        }
        else {
            check = false;
        }
        System.out.println(check);
        return check;
    }
    private static void printStringMultipleTimes(String s, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(s);
        }
    }
    private static void task9() {
        int[] arr = {1,0,1,0,1,0,1};
        int b = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr [i] = 0;
            }else {
                arr [i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static boolean LeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void task11() {
        int[] arr = {1, 0, 0, 0, 0, 0, 1};
        int a = 0;
        int b = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                arr[i] = b;
            } else if (arr[i] == b) {
                arr[i] = a;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void task12() {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i;
            System.out.println(Arrays.toString(arr));
        }
    }
    public static void task13() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static int[][] table() {
        int a = 3;
        int[][] table = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i == j) {
                    table[i][j] = 1;
                } else {
                    table[i][j] = 0;
                }
            }
        }
        return table;
    }
}








