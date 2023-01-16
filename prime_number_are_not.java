import java.util.Scanner;

public class prime_number_are_not {
    public static void main(String args[]) {
        System.out.println("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count += 1;
            }
        }
        if (count == 2) {
            System.out.println("It is prime number");
        } else {
            System.out.println("It is not prime number");
        }
    }
}
