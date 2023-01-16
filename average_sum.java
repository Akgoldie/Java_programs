import java.util.Scanner;

public class average_sum {
    public static void main(String[] args) {
        System.out.println("Enter the number of marks");
        Scanner in=new Scanner(System.in);
        int n =in.nextInt();
        int sum=0;
        for (int i =0; i<n; i++){
            Scanner inm=new Scanner(System.in);
            int marks =inm.nextInt();
            sum=sum+marks;


        }
        float avg=sum/n;
        System.out.println("Total marks :"+sum);
        System.out.println("Average marks: :"+avg);
    }
}
