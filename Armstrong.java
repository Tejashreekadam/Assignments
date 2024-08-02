import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       int sum = 0;
       while(num > 0) {
           int rem = num % 10;
           int cube = rem * rem * rem;
           sum = sum + cube;
          num = num / 10;
       }
       
        System.out.println(sum);
    }

}
