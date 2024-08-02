import java.util.Scanner;

public class Currency {
    //Input currency in rupees and output in USD.
    //1 USD = 83.30055 INR
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter the RUPEE ");
        int INR = sc.nextInt();
        float  USD = (float) ( INR/ 83.27);  // (INR / USD 1 $)
        System.out.println( USD+ "$");
    }
}
