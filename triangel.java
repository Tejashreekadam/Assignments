import  java.util.Scanner;

public class triangel {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter the base ");
        int base = sc.nextInt();
        System.out.println("Enter the height");
        int height= sc.nextInt();


      int tri = (int) (0.5 *base*height);
        System.out.println( "The area of triangle is "+tri);




    }


}
