import java.util.Scanner;

public class Factor {
//Input a number and print all the factors of that number (use loops).

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" enter the number ");
        int num= sc.nextInt();

       // int num = 10;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println("Factor of the number is " + i);
            }

        }
    }
}

