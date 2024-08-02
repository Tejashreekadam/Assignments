import java.util.Scanner;
//Take name as input and print a greeting message for that particular name
public class Gretings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the name ");
        String name = sc.next();
        System.out.println(name + " hello how are you !!! have a good day  ");
    }
}
