import java.util.Scanner;

public class Avarage {
    //Calculate Average Of N Numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        double avg;
        int sum=0;

        for (int i=0 ; i<num ;i++ ) {
            sum += sc.nextInt();
        }
            avg=sum/num;
        System.out.println("avrage is "+avg);

    }
}
