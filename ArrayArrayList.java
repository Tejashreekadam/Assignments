import java.util.Arrays;
import java.util.Scanner;

public class ArrayArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //array of primitives

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr)); // adding a brackets ,comma

        // array of objects

        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));

        }
    }

