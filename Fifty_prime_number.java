public class Fifty_prime_number {
    public static void main (String args[]){
        int n=50;
        int count=0;
        for (int i=1;i<=n;i++){
            //System.out.println(i);

            for (int j=1;j<=i;j++) {
                //System.out.println(j);
                if (j % i == 0) {
                    count += 1;
                }
                if (count == 2) {
                    System.out.println( i+ " is prime number");
                }
            }



        /*int n=50;
        for (int i=0; i>n;i++){
            System.out.println(i);*/
        }
    }

}