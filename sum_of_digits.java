import java.util.Scanner;

public class sum_of_digits {
    public static void main (String args[]){
        int number, digit, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = sc.nextInt();
        while(number > 0)
        {
            digit = number % 10;
            //System.out.print(digit);
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println("Sum of Digits: "+sum);
}
}
