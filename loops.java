import java .util.Scanner;
// area of circle
public class loops {
    public static void main(String[] args) {

        float pai = 3.14F;
        System.out.println("Enter the radius");

        Scanner sc = new Scanner(System.in);
        int radi= sc.nextInt();
        System.out.println(radi);
        float circle =pai *radi*radi;
        System.out.println("the area of circle  is"+circle);



    }
}