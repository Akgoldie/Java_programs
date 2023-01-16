public class armstrong_num_range_nums {
    public static void main(String[] args){
        System.out.println("Range between 100 to 999");
        int f=100;
        int l=999;
        for (int i=100; i<=999; i++){
            int a,b,c,d;
            a=i/100;
            b=i%100;
            b=b/10;
            //b=b/10;
            c=i % 10;
            d=(a*a*a)+(b*b*b)+(c*c*c);
            if (i==d){
                System.out.println(i+" is Armstrong Number");
            }
        }
    }
}
