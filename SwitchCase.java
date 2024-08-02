import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch (fruit) {
            case "mango":
                System.out.println("king of fruit");
                break;
            case "apple":
                System.out.println("a sweet red fruit");
                break;
            case "grapes":
                System.out.println("small fruit");
                break;
            default:
                System.out.println("enter the valid fruit name");
        }
        // or
        switch (fruit) {
            case "banana" -> System.out.println("yellow fruit");
            case "kiwi" -> System.out.println("green");
            case "watermelon" -> System.out.println("sweet fruit");
            case "blueberry" -> System.out.println("blue fruit");
            default ->  System.out.println("enter  valid fruit name");

        }
    }
}