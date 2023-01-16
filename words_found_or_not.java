import java.util.Scanner;

public class words_found_or_not {
    public static void main(String args[]){
        System.out.println("Enter the sentences");
        Scanner in = new Scanner(System.in);
        String strings = in.nextLine();
        //System.out.println(strings);
        System.out.println("Enter the search word");
        Scanner finds = new Scanner(System.in);
        String find = finds.nextLine();
        //System.out.println(find);
        boolean check=strings.contains(find);
        if(check){
            System.out.println("It is found");
        }else {
            System.out.println("It is not found");
        }
    }
}
