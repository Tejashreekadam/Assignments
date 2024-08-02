import java.util.Arrays;

import static java.util.Arrays.sort;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = { 3,7,6,2,5,2,2 } ;
        sort(arr);
        System.out.println(Arrays.toString(arr));
        int i = 0;
            while (i < arr.length) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    i++;
                }
            }
        }
        static void swap(int[] arr, int first , int second ) {
                int  temp = arr [first];
                arr [first] = arr [second] ;
                arr [second] = temp ;
            }
    }



