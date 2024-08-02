import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
      //  Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
// formula for simple interest is (p*r*s)/100

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the principal ");
        int p= sc.nextInt();
        System.out.println("enter the time ");
        int  t= sc.nextInt();
        System.out.println("enter the rate ");
        int r= sc.nextInt();

        int SI = (p*r*t)/100 ;
        System.out.println(" simple interest is "+SI);

    }
}

