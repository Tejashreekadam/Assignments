import java.util.Scanner;

public class Vote
{
   //A person is eligible to vote if his/her age is greater than or equal to 18.
    // Define a method to find out if he/she is eligible to vote.

    public static void main(String[] args) {
        Vote();
    }
    static void Vote(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("eliigible");
        }
        else {
            System.out.println("not eligible");
        }

    }


}
