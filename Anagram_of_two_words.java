import java.util.Arrays;
import java.util.Scanner;

public class Anagram_of_two_words {
    public static void main(String[] args) {
        //String Str1 = "pairs";
        //String Str2 = "paris";
        System.out.println("Enter the word_1");
        Scanner in = new Scanner(System.in);
        String Str1 = in.nextLine();
        //System.out.println(Str1);
        System.out.println("Enter the word_2");
        Scanner finds = new Scanner(System.in);
        String Str2 = finds.nextLine();
        //System.out.println(Str2);
        Str1 = Str1.toLowerCase();
        Str2 = Str2.toLowerCase();
        if(Str1.length() == Str2.length()) {
            char[] charArray1 = Str1.toCharArray();
            char[] charArray2 = Str2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            boolean result = Arrays.equals(charArray1, charArray2);
            if(result) {
                System.out.println(Str1 + " and " + Str2 + " are anagram.");
            }
            else {
                System.out.println(Str1 + " and " + Str2 + " are not anagram.");
            }
        }
        else {
            System.out.println(Str1 + " and " + Str2 + " are not anagram.");
        }
    }
}
