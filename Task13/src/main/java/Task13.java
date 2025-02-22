public class Task13 {
    public static void main(String[] args) {
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