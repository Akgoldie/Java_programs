import java.util.Scanner;

public class multiplicaton_table {
    public static void main(String[] args){

        System.out.println("Enter the number and limit");
        Scanner in =new Scanner(System.in);
        int N=in.nextInt();
        int l=in.nextInt();
        for (int i =1; i<=l; i++){
            System.out.println(N+" x "+i+" = "+(N*i));
        }
    }
}
