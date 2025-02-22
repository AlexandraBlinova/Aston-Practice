public class Task2 {
    public static void main(String[] args) {
        checkSumSign();
    }
    private static void checkSumSign() {
        int a = 34;
        int b = 43;
        int c = a + b;
        if (c>=0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
}
