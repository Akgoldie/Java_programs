import java.util.Scanner;


public class Find_ASCII_Value_of_a_character {
    public static void main (String args[]){
        System.out.println("Enter the character: ");
        Scanner num1 =new Scanner(System.in);
        String character= num1.nextLine();
        System.out.println("character: "+character);
        //char character='a';
        //int ascii = character;
        //int castAscii = (int) character;
        System.out.println("The ASCII value of " + character + " is: " +(int)character);
        //System.out.println("The ASCII value of " + character + " is: " + ascii);
        //System.out.println("The ASCII value of " + character + " is: " + castAscii);
    }
}
