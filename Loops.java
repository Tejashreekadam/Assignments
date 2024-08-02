import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // basic syntax for loop

        for (int num = 1; num <= 5; num++) {
            System.out.println(num);

        }
        System.out.println();
        // basic syntax for  while loop
        // while loop used when we dont know the how many time loop ill run .

        int num = 1;
        while (num <= 5) {  //condition
            System.out.println(num);
            num++;
        }
        System.out.println();
        //  Do while loop

        int n = 1;
        do {
            System.out.println("hello");
        }
        while (n != 1);
    }

}