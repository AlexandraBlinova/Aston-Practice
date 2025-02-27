import java.util.Arrays;

public class Lesson_3_1 {
    public static void main(String[] args) {
        //LeapYear(); (Task 7)
        //printStringMultipleTimes("abc", 7);
        //massive();
        //arr1();
        //arr2();
        //arr3();
        table();
    }


    private static void LeapYear() {
    }

    private static void LeapYear(int a) {
        int b = a % 4;
        int c = a % 400;
        int d = a % 100;
        if (b == 0 || c == 0) {
            System.out.println("true");
        } else if (d == 0 || c > 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }

    private static void printStringMultipleTimes() {
    }

    private static void printStringMultipleTimes(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }
    private static void massive() {
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
    public static void arr1() {
        int[] arr = {1, 0, 0, 0, 0, 0, 1};
        int a = 0;
        int b = 1;
        for (int i = 0; i < arr.length; i++) { // Используем arr.length для перебора всех элементов массива
            if (arr[i] == a) {
                arr[i] = b;
            } else if (arr[i] == b) {
                arr[i] = a;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void arr2() {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i;
            System.out.println(Arrays.toString(arr));
        }
    }
    public static void arr3() {
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
    public static void table() {
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


        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}

