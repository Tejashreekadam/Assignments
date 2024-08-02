import java.util.ArrayList;
import java.util.Arrays;

public class StringBuilder {
    public static void main(String[] args) {
        String a = "tej" ;
        String b = "tej";
        System.out.println(a==b);

        String A = new String("tejashree");
        String B = new String("tejashree");
        System.out.println(A==B);
        System.out.println(A.equals(B));

        //PREETTY PRINTINNG

        float c =453.1234f ;
        System.out.printf( "Formatted no is %2f ",c);
        System.out.println(Math.PI);
        System.out.printf("hello my nameis %s and i am %s " ,"tejashree" ,"cool");

        // operators
        System.out.println('e'+'f');
        System.out.println((char) ('e'+ 3));
        System.out.println('e'+3);
        System.out.println("e"+1);
        System.out.println("tejashree"+new ArrayList<>());

        //string builder
        StringBuilder builder = new StringBuilder();
        for (int i=0 ;i<26 ;i++) {
            char ch = (char) ('a' + i);
        }
        System.out.println(builder.toString());

        //Methods
        String name ="tejashree kadam" ;
        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('a'));


        }
    }

