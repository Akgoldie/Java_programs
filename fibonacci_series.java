import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {

        //Scanner num = new Scanner(System.in);
        //System.out.println("Enter the number of times: ");
        //int fib = num.nextInt();
        //System.out.println(fib);
        int f1=0;
        int f2=1;
        int f3=0;
        //for (int i =0; i<=fib; i++){
        for (int i =0; i<=15; i++){
            System.out.println(f3);
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }

    }
}
