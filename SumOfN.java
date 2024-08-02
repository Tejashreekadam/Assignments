import java.util.Scanner;

public class SumOfN {
    //Sum Of N Numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println(" enter the numbers ");
        int num = sc.nextInt();
        int sum=0  ;
         for (int i =0 ; i<=num ;i++) {
             sum += i;
         }
        System.out.println("the sum of number is " +sum);
    }


}
