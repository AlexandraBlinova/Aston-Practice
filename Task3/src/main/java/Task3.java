public class Task3 {
    public static void main(String[] args) {
        printColor();
    }
    public static void printColor() {
        int value = -124359;
        if (value < 0 ) {
            System.out.println("Красный");
        }
        if (value >= 1 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }
}
