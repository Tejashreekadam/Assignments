import java.util.Scanner;

public class MaxMin {
    //Define two methods to print the maximum and the minimum number respectively
    // among three numbers entered by the user.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        System.out.println("Enter number 1");
        int num1=sc.nextInt();
        System.out.println("Enter number 2");
        int num2= sc.nextInt();
        System.out.println("Enter number 3");
        int num3= sc.nextInt();

        System.out.println("From numbers above max number is " );

        if (num1 > num2 && num1 > num3){
            System.out.println(num1);
        } else if (num2 > num3) {
            System.out.println(num2);
        }
        else {
            System.out.println(num3);
        }


    }
}
