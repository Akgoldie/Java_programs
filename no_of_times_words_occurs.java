import java.util.Scanner;

public class no_of_times_words_occurs {
    public static void main(String args[]) {
        System.out.println("Enter the sentences");
        Scanner in = new Scanner(System.in);
        String strings = in.nextLine();
        //System.out.println(strings);
        System.out.println("Enter the search word");
        Scanner finds = new Scanner(System.in);
        String find = finds.nextLine();
        //System.out.println(find);
        String temp[] = strings.split(" ");
        int l= temp.length;
        //System.out.print(l);
        int count=0;
        for (int i=0; i<l; i++) {
            if (find.equals(temp[i])) {
                count += 1;
            }
        }
        if(count>0){
            System.out.println(count+" times found the word");
            }


    }
}
