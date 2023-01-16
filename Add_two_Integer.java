import java.util.Scanner;

public class Add_two_Integer {
    public static void main(String args[]){
        System.out.println("Enter the First number: ");
        Scanner num1 =new Scanner(System.in);
        int number1= num1.nextInt();
        System.out.println("Enter the Second number: ");
        Scanner num2 =new Scanner(System.in);
        int number2 = num2.nextInt();
        int c=number1+number2;
        System.out.println("Add the two numbers: "+c);
    }

}
