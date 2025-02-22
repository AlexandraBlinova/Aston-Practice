import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a + b;
        if (c >= 10 && c <= 20) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
