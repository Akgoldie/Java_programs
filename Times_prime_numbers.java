import java.util.Scanner;

public class Times_prime_numbers {
    public static void main(String[] args){
        int count=0,n=0,i=1,j=1;
        //Scanner in = new Scanner(System.in);
        //System.out.println("Enter the times: ");
        //int num= in.nextInt();
        int num=50;
        while(n<num)
        {
            j=1;
            count=0;
            while(j<=i)
            {
                if(i%j==0)
                    count++;
                j++;
            }
            if(count==2)
            {
                System.out.printf("%d ",i);
                System.out.println("");

                n++;
            }
            i++;


        }
    }
}
