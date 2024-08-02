import java.util.Scanner;

public class LargestTill0 {
    //Take integer inputs till the user enters 0 and print the largest number from all.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int larg=0;
        while (num != 0){
            if ( num > larg);
            larg =num;
            num= sc.nextInt();

            System.out.println(larg);
        }
    }
}
