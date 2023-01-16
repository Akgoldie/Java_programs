public class sum_of_numer_in_array {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int sum = 0;
        int n = a.length;
        for (int i = 0; i <n; i++) {
            sum+=a[i];

        }
        System.out.println("Sum of numbers in array: "+sum);
    }
}
