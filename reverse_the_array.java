import java.util.Arrays;

public class reverse_the_array {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int temp = 0;
        int n = a.length;
        for (int i = 0; i <= (n / 2); i++) {
            temp = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(a));
    }
}
