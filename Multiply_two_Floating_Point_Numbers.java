import java.util.Scanner;

public class Multiply_two_Floating_Point_Numbers {
    public static void main(String args[]){
        System.out.println("Enter the First number: ");
        Scanner num1 =new Scanner(System.in);
        float number1= num1.nextFloat();
        System.out.println("Enter the Second number: ");
        Scanner num2 =new Scanner(System.in);
        float number2 = num2.nextFloat();
        float c=number1*number2;
        System.out.print("Multiply two Floating Point Numbers : "+c);
    }
}
