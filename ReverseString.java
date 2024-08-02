import java.util.Scanner;

public class ReverseString {
    //Reverse A String In Java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String name = sc.next();
        // to convert string into char
        char[] cs= name.toCharArray();
        char temp ;
        int n = cs.length;

         for (int i = 0 ; i< n/2 ; i++)
         {
             temp = cs [i] ;
             cs [i] = cs [n-i-1];
             cs [n-i-1]=temp;
         }
        System.out.println(cs);
    }
}
