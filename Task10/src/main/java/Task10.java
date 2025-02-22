import java.util.Arrays;

public class Task10 {

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 0, 0, 0, 1};
        int a = 0;
        int b = 1;
        for (int i = 0; i < 7; i++) {
            if (arr[i] == a) {
                arr[i] = b;
            } else if (arr[i] == b) {
                arr[i] = a;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}



