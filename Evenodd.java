import java.util.Scanner;

//Write a program to print whether a number is even or odd, also take input from the user.

public class Evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = sc.nextInt();
        int rem = num % 2;
         if (rem ==0 )
             System.out.println(num +" number is even");
         else
             System.out.println("number is odd ");

    }
}
