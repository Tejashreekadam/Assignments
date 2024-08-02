import java.util.Scanner;

public class DiscountProduct {
    //Calculate Discount Of Product
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter the price ");
        int price = sc.nextInt();
        System.out.println("Enter the discount");
        int discount = sc.nextInt();
        System.out.println(" Discounted price is " + (price- (0.01*discount)*price) );

    }
}
