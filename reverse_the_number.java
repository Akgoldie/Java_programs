import java.util.Scanner;

public class reverse_the_number {
    public static void main (String args[]){
        int number, digit, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = sc.nextInt();
        while(number > 0)
        {
            digit = number % 10;
            System.out.print(digit);
            //System.out.print("\n");
            sum = sum + digit;
            number = number / 10;
        }
        //System.out.println("Sum of Digits: "+sum);
    }
}

