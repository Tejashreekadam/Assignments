import java.util.Scanner;
//Take 2 numbers as input and print the largest number

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1 ");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2 ");
        int num2 = sc.nextInt();
        int largest;

      if(num1>num2)
    largest = num1;
      else
    largest = num2;

      System.out.println("\nLargest = " +largest);
    }
}

