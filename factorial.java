import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int fact=1;
        //int fac=10;
        Scanner in=new Scanner(System.in);
        int fac =in.nextInt();
        for (int i=1; i<=fac; i++){
            //System.out.println("j"+i);
            //System.out.println("k"+fact);
            fact=fact*i;


        }
        System.out.println(fact);
    }
}
