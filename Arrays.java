import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // syntax of array

        // q : store a roll num
        int a = 19 ;

        // Q : store a person name
        String name = "niki";

        // q ; store a 5 roll num ;
        int rno1 = 23 ;
        int rno2 = 24 ;

        //syntax
        // datatype[] variable_name = new datatype [size];
        //store 5 roll num
        int[]rnos = new int [5];
        // or directly
        int[] rnos2 = { 23 , 24 , 46 , 78 , 89};

        int [] ros ; // declaration of array . ros is getting defind in th stack
        ros = new  int [5] ; // intialization : actually hr object is being created in th memory (heap)

        System.out.println(ros[1]);

        String[] arr = new String[5] ;
        System.out.println(arr[0] ) ;

        // array using for loop


        int []array =new int[3];
        array [0]=23 ;
        array [1]=45;
        array [2]=56;
        System.out.println(array[2]);


        // or

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
            System.out.print(array[i] + " ");
        }

// or

        for (int num : array) { //for every element  in array,print the element
            System.out.println(num + " ");//here num represents element of the array
        }


    }

}
