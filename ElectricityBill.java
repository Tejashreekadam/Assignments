import java.util.Scanner;

public class ElectricityBill {
    //Calculate Electricity Bill
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int price ,num;
        num = sc.nextInt();
        System.out.println("Enter the price of singel unit " );
        price = sc.nextInt();
        System.out.println(" total bill is " + price*num);
    }
}
