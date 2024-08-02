import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // syntax
        ArrayList<Integer> list =new ArrayList< >(10) ;
        list.add(56) ;
        list.add(54) ;
        list.add(57) ;
        list.add(53) ;
        list.add(52) ;
        list.add(12) ;
        System.out.println(list.contains(54));
        System.out.println(list.set(0,88));
        System.out.println(list.remove(3));
        System.out.println(list);
    
        //input
        for (int i = 0; i <5 ; i++) {
            list.add(in.nextInt());
        }
        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);
            
        }
            
        }

