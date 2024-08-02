import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentionArray {
    public static void main(String[] args) {
        /*
              1 2 3
              4 5 6
              7 8 9
         */


        Scanner in =new Scanner(System.in);
      int[][] arr  = new int[3][] ;
      int [] [] arr2D = {
              { 1,2,3 }, // 0th index
              {4,5}, // 1 st index
              {6,7,8,9} //2nd index  arr2D[2] ={ 6,7,8,9 }
      };

      //input

        int [][] array = new int[3][3] ;
        System.out.println(array.length); // no of rows

        for (int row = 0; row < array.length; row++) {
          //  System.out.println(Arrays.toString(array[row]));
            // for each col in every row

            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = in.nextInt();
            }
        }
        // output

        for (int row = 0; row < array.length; row++) {
            // for each col in every row

            for (int col = 0; col < array[row].length ; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
            System.out.println();
        }

        //

        for (int [] a:arr)
            System.out.println(Arrays.toString(a));
    }
}
