
public class Reverse_the_String {
    public static void main (String args []){
        String s="ram";
        //String temp="";
        char temp1;
        //use method
        StringBuilder string = new StringBuilder();
        string.append(s);
        string.reverse();
        System.out.println(string);



        //using for loop
        /*for (int i =0; i<s.length(); i++){
            temp1=s.charAt(i);
            temp=temp1+temp;
            //System.out.println(temp);
        }
        System.out.println(temp);*/
    }
}
