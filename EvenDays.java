import java.util.Scanner;

public class EvenDays {
    //Kunal is allowed to go out with his friends only on the even days of a given month.
    // Write a program to count the number of days he can go out in the month of August.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        for (int i =1 ; i<=31 ; i++){
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
}
